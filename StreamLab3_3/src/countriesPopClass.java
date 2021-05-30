import java.util.List;
import java.util.stream.Collectors;

public class countriesPopClass {
	 public List<Integer> countriesPop(List<Country> countries){
	    	return countries.stream().map(Country::getPopulation).collect(Collectors.toList());
	    }
}
