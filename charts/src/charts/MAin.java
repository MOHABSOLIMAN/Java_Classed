package charts;
import java.io.File;
import java.io.IOException;
import java.util.List;

import joinery.DataFrame;
import tech.tablesaw.api.Table;
import tech.tablesaw.io.csv.CsvReadOptions;
import tech.tablesaw.io.csv.CsvReader;

public class MAin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "src/main/resources/titanic-passengers.csv";
    // make some statistic using joinery
        TittianicDOA.readcsvujoinery(filename);
        // make some statistic using tablesaw
        TittianicDOA.readcsvuTableSaw(filename);
        
//		 testing reading json file using jackson and ploting using xchart 

		TittianicDOA tittianicDOA = new TittianicDOA();
        List<TitanicPassenger> passengers =tittianicDOA.getPassengersFromJsonFile();
        tittianicDOA.graphPassengerAgesDraw(passengers);
        tittianicDOA.graphPassengerClass(passengers);
        tittianicDOA.graphPassengerSurvived(passengers);
        tittianicDOA.graphPassengerSurvivedGender(passengers);
        
        System.out.println("test"+passengers.get(0).getName());
		
	}

}