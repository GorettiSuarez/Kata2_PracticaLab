package kata2_practicalab;

import java.util.HashMap;
import java.util.Map;

public class Kata2_PracticaLab {

    public static void main(String[] args) {
        int [] v = {1,4,7,1,1,8,4,1,4,9};
        Map<Integer,Integer> histogram = new HashMap<>();
        
        for (int i = 0; i < v.length; i++) {
            if(histogram.containsKey(v[i])){
                histogram.put(v[i], histogram.get(v[i])+1);
            } else {
                histogram.put(v[i],1);
            }
        }
        
        for (Integer key : histogram.keySet()) {
            System.out.println(key+" : " + histogram.get(key));
        }
    }
    
}
