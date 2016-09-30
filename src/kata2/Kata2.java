package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        //int[] vector = {2, 1, 3, 1, 4, 6, 100, 100, 2, 100};
        //Double[] vector = {2.0, 3.2, 4.1, 100.5, 100.5,100.5};
        String[] vector = {"Juan", "Fran", "Pepe", "Pepe", "Pepe", "Pepe"};

        Histogram histo = new Histogram(vector);
        
        HashMap<Object, Integer> histogram = histo.getHistogram();

        for (Object key : histogram.keySet()) {
            System.out.println(key + " --> " + histogram.get(key));
        }
    }
}
