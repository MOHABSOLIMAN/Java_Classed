import java.util.*;

import java.util.stream.*;

public class App {
    public static void main(String[] args) throws Exception {

        List<Country> countries = CountryCSV.readCountriesCSV("Countries.csv");       
        List<City> cities = CityCSV.readCitiesCSV("Cities.csv");
        
        Map<String, List<City>> map = new HashMap<>();
        for(Country c :countries){
            map.put(c.getCode(), cities.stream()
            .filter(city ->c.getCode().equals(city.getCountryCode()))
            .collect(Collectors.toList()));
        }
        
        Scanner sc= new Scanner(System.in); 
        String countryCode = sc.nextLine();
        List<City> requestedList = map.get(countryCode); 
        Collections.sort(requestedList);
        for(int i = 0; i < requestedList.size(); i++) {
        	System.out.print(requestedList.get(i).getName() + ' ');
        	System.out.print(requestedList.get(i).getPopulation() + ' ');
        	System.out.println();
        }
        /* Countries population */
        countriesPopClass ConPop = new countriesPopClass();
        System.out.println("Countries population: ");
        System.out.println(ConPop.countriesPop(countries));
        
        /* Countries population average */
        countriesPopAvgClass ConPop_avg = new countriesPopAvgClass();
        System.out.println("Countries population average: ");
        System.out.println(ConPop_avg.countriesPopAvg(countries));
        
        /* Highest Population Cities */
        highestPopCitiesClass Cities_highestPop = new highestPopCitiesClass();
        Cities_highestPop.highestPopCities(map);
        
        /* Highest Population Capital */
        HighestPopulationCapitalClass Capital = new HighestPopulationCapitalClass();
        Capital.HighestPopulationCapital(map);
    }
}
