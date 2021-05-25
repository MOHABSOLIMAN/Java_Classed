package Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class pyramidcsv extends Thread {
    public pyramidcsv(){

    }

    public List<pyramid> reader(String fileinfo) throws IOException {

        List<pyramid> pyramids = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileinfo));
        String[] parts = new String[0];
        pyramid pd;
        String Line = br.readLine();

        do {  Line=br.readLine();
            if (Line != null) {
                System.out.println(Line);
                parts = Line.split(",");
                if (parts[7].isEmpty()){
                    pd = new pyramid(parts[0], parts[2], parts[4], 0.0);
                    pyramids.add(pd);

                }else { pd = new pyramid(parts[0], parts[2], parts[4],Double.parseDouble(parts[7]));
                    pyramids.add(pd);
                }
            }
        } while (Line != null);

        br.close();
        return pyramids;


    }

    public pyramid parts(String[] info){
        String pharoh = info[0];
        String modern_name = info[2];
        String site = info[4];
        double height = Double.parseDouble(info[7]);
        return new pyramid(pharoh,modern_name,site,height);
    }
    }