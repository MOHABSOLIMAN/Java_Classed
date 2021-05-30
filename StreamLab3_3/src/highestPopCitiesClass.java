import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class highestPopCitiesClass {
	public void highestPopCities(Map<String, List<City>> map){
        List<City> a =  map.values().stream().map(citiesPerCountry -> citiesPerCountry.stream().max(Comparator.comparingInt(City::getPopulation)).orElse(new City())).collect(Collectors.toList());
        a.forEach(s -> System.out.println(s.getName()));
    }
}
