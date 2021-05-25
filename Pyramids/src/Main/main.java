package Main;

import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        pyramidcsv pf = new pyramidcsv();
        List<pyramid> pyramid_list = pf.reader("D:\\Games Isos\\archive\\pyramids.csv");
        pyramid_list.sort(Comparator.comparingDouble(pyramid::getHeight));
        int i = 1;
        for (pyramid p : pyramid_list) {

            System.out.println((i += 1) + " " + p.getPharoh() + " " + p.getModern_name() + " " + p.getSite() + " " + p.getHeight());

        }
            Map<String, Integer> count_map = new HashMap<>();

            for (pyramid pp : pyramid_list) {

                String site = pp.getSite();
                Integer no_sites = count_map.get(site);
                if (no_sites == null) {
                    no_sites = 1;
                } else {
                    no_sites++;
                }
                count_map.put(site, no_sites);}
                System.out.println(count_map);



        }
    }