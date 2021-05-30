import java.util.List;

public class countriesPopAvgClass {
	public Double countriesPopAvg(List<Country> countries){
        return countries.stream().map(Country::getPopulation).mapToInt((x)->x).average().getAsDouble();
    }
	public int countriesPopMax(List<Country> countries){
        return countries.stream().map(Country::getPopulation).mapToInt((x)->x).max().getAsInt();   
    }
}
