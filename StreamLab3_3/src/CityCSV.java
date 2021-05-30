import java.util.*;
import java.io.*;
public class CityCSV {
    public static List<City> readCitiesCSV(String name){
        List<City> cities =new ArrayList<City>();
        FileReader r;
        try {
            r = new FileReader(name);
            BufferedReader inputR = new BufferedReader(r);
            inputR.readLine();
            String s;
            while(true){
                s = inputR.readLine();
                if(s == null)break;
                String sa[] = s.split(",");
                cities.add(new City(Integer.parseInt(sa[0]), sa[1], Integer.parseInt(sa[2]), sa[3].replaceAll("\\s", "")));
            }
            inputR.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cities;
   } 
}
