import java.util.*;
import java.io.*;
public class CountryCSV {
    public static List<Country> readCountriesCSV(String name){
        List<Country> countries =new ArrayList<Country>();
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
                int pop;
                try{
                    pop = Integer.parseInt(sa[4]);
                }catch(Exception e){
                    pop = 0;
                }
                countries.add(new Country(sa[0], sa[1], sa[2], Double.parseDouble(sa[3]), pop, Double.parseDouble(sa[5]), Integer.parseInt(sa[6])));
            }
            inputR.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return countries;
    }
}
