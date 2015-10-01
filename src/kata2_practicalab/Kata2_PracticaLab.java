package kata2_practicalab;

import java.util.Map;

public class Kata2_PracticaLab {

    public static void main(String[] args) {
        int [] v = {1,4,7,1,1,8,4,1,4,9};
        Histogram histo = new Histogram(v);
        Map<Integer,Integer> histogram = histo.getHisto();
        
        
        
        for (Integer key : histogram.keySet()) {
            System.out.println(key+" : " + histogram.get(key) + " veces");
        }
    }
    
}
