
public class City implements Comparable<City> {
    private int id;
    private String name;
    private int population;
    private String countryCode;
    public City(){
        
    }
    public City(int id, String name, int population, String countryCode){
        this.id = id;
        this.name=name;
        this.population= population;
        this.countryCode=countryCode;
    }
    public String getCountryCode() {
        return countryCode;
    }
    public String getName() {
        return name;
    }
    public int getPopulation() {
        return population;
    }
    public int getId() {
        return id;
    }
    @Override
    public int compareTo(City c) {
    	if(this.population < c.population)
    		return -1;
    	if(this.population == c.population)
    		return 0;
    	else
    		return 1;
    }
}
