package charts;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;
import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.style.Styler;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.imageio.spi.InputStreamImageInputStreamSpi;

import joinery.DataFrame;
import tech.tablesaw.api.Table;
import tech.tablesaw.io.csv.CsvReadOptions;

public class TittianicDOA {
public  static void readcsvuTableSaw(String filename) {
// read csv file using tablesaw  to test dependdencies 
	
	CsvReadOptions.Builder builder = 
			CsvReadOptions.builder(filename)
				.separator(';')									// table is tab-delimited
				.header(true).maxNumberOfColumns(Integer.valueOf(12))											// no header
				;  				// the date format to use. 

		CsvReadOptions options = builder.build();

		Table t1 = null;
		try {
			t1 = Table.read().usingOptions(options);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	System.out.println(t1.columns());
	System.out.println(t1.summary());
}
public  static void readcsvujoinery(String filename) {
	

	try {
		DataFrame<Object> titanicpassengers = DataFrame.readCsv(filename,";");
		//DataFrame<Object> t1 =  titanicpassengers.groupBy(m->m.stream().filter(t->t.toString() =="Sex").).mean();
		//System.out.println(t1);
		titanicpassengers.columns().stream().filter(m-> titanicpassengers.get(0, m) instanceof Number).collect(Collectors.toList()).forEach(t->System.out.println(t.toString()));
		//System.out.println(titanicpassengers.retain("Sex", "SibSp", "Parch", "Fare").groupBy(m->m.get(0)).mean());
		DataFrame<Object> passengers_stat = titanicpassengers.retain("Sex","SibSp", "Parch", "Fare");
		System.out.println("mean  "+passengers_stat.groupBy(c->c.get(0)).mean());
		System.out.println("min :"+passengers_stat.groupBy(c->c.get(0)).min());
		System.out.println("max :"+passengers_stat.groupBy(c->c.get(0)).max());
		System.out.println("std dev :"+passengers_stat.groupBy(c->c.get(0)).stddev());
		System.out.println("var :"+passengers_stat.groupBy(c->c.get(0)).var());
		System.out.println("sum :"+passengers_stat.groupBy(c->c.get(0)).sum());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//titanicpassengers.su

}
public  List<TitanicPassenger> getPassengersFromJsonFile() {
	List<TitanicPassenger> allPassengers = new Vector<TitanicPassenger>();
    ObjectMapper objectMapper = new ObjectMapper ();
    objectMapper.configure (DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    try (InputStream input = new FileInputStream ("src/main/resources/titanic_csv.json")) {
        //Read JSON file
        allPassengers = objectMapper.readValue (input, new TypeReference<List<TitanicPassenger>> () {
        });
    } catch (FileNotFoundException e) {
        e.printStackTrace ();
    } catch (IOException e) {
        e.printStackTrace ();
    }
    return allPassengers;
}
public void graphPassengerAges(List<TitanicPassenger> passengerList) {
	//filter to get an array of passenger ages
	
	}
public void graphPassengerAgesDraw(List<TitanicPassenger> passengerList) {
	List<Double> pAges = passengerList.stream ().map (TitanicPassenger::getAge).collect (Collectors.toList ());
	List<String> pNames = passengerList.stream ().map (TitanicPassenger::getName).collect (Collectors.toList ());
	//Using XCart to graph the Ages 1.Create Chart
	CategoryChart chart = new CategoryChartBuilder ().width (1024).height (768).title ("Age Histogram").xAxisTitle ("Names").yAxisTitle
	("Age").build ();
	// 2.Customize Chart
	chart.getStyler ().setLegendPosition(Styler.LegendPosition.InsideNW);
	chart.getStyler ().setHasAnnotations (true);
	chart.getStyler ().setStacked (true);
	// 3.Series
	chart.addSeries ("Passenger's Ages", pNames, pAges);
	// 4.Show it
	new SwingWrapper (chart).displayChart ();
	}

public  void graphPassengerClass(List<TitanicPassenger> passengerList) {
	Map<String,Long> pclasses = passengerList.stream ().collect (Collectors.groupingBy(TitanicPassenger::getPclass,Collectors.counting()));

// Create Chart
PieChart chart = new PieChartBuilder ().width (800).height (600).title (getClass ().getSimpleName ()).build ();
// Customize Chart
Color[] sliceColors = new Color[]{new Color (180, 68, 50), new Color (130, 105, 120), new Color (80, 143, 160)};
chart.getStyler ().setSeriesColors (sliceColors);
// Series
chart.addSeries ("First Class", pclasses.get("1"));
chart.addSeries ("Second Class", pclasses.get ("2"));
chart.addSeries ("Third Class", pclasses.get ("3"));
// Show it
new SwingWrapper (chart).displayChart ();
}
public  void graphPassengerSurvived(List<TitanicPassenger> passengerList) {
	Map<String,Long> pclasses = passengerList.stream ().collect (Collectors.groupingBy(TitanicPassenger::isSurvived,Collectors.counting()));

// Create Chart
PieChart chart = new PieChartBuilder ().width (800).height (600).title (getClass ().getSimpleName ()).build ();
// Customize Chart
Color[] sliceColors = new Color[]{new Color (180, 68, 50), new Color (130, 105, 120), new Color (80, 143, 160)};
chart.getStyler ().setSeriesColors (sliceColors);
// Series
chart.addSeries ("survived", pclasses.get("1"));
chart.addSeries ("not survived", pclasses.get ("0"));
// Show it
new SwingWrapper (chart).displayChart ();
}
public  void graphPassengerSurvivedGender(List<TitanicPassenger> passengerList) {
	Map<String,Long> pclasses = passengerList.stream ().filter(m->m.isSurvived().equals("1")).collect (Collectors.groupingBy(TitanicPassenger::getSex,Collectors.counting()));

// Create Chart
PieChart chart = new PieChartBuilder ().width (800).height (600).title (getClass ().getSimpleName ()).build ();
// Customize Chart
Color[] sliceColors = new Color[]{new Color (180, 68, 50), new Color (130, 105, 120), new Color (80, 143, 160)};
chart.getStyler ().setSeriesColors (sliceColors);
// Series
chart.addSeries ("female survived", pclasses.get("female"));
chart.addSeries ("male survived", pclasses.get ("male"));
// Show it
new SwingWrapper (chart).displayChart ();
}
}