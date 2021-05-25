package Main;

import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        pyramidcsv pc = new pyramidcsv();
        List<pyramid> pyramidd = pc.reader("D:\\Games Isos\\archive\\pyramids.csv");
        pyramidd.sort(Comparator.comparingDouble(pyramid::getHeight));
        int i = 1;
        for (pyramid p : pyramidd) {

            System.out.println((i += 1) + " " + p.getPharoh() + " " + p.getModern_name() + " " + p.getSite() + " " + p.getHeight());

        }
            Map<String, Integer> counting_map = new HashMap<>();

            for (pyramid pp : pyramidd) {

                String site = pp.getSite();
                Integer no_sites = counting_map.get(site);
                if (no_sites == null) {
                    no_sites = 1;
                } else {
                    no_sites++;
                }
                counting_map.put(site, no_sites);}
                System.out.println(counting_map);



        }
    }