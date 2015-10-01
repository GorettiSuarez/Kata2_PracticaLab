package kata2_practicalab;


public class Kata2_PracticaLab {

    public static void main(String[] args) {
        String [] v1 = {"Ana","Pablo", "Juan", "Ana", "Ana","Juan"};
        Integer [] v = {1,4,7,1,1,8,4,1,4,9};
        Histogram<Integer> histo = CalculaHistogram.computeHisto(v);
        
        
        for (Object key : histo.keySet()) {
            System.out.println(key+" : " + histo.get(key) + " veces");
        }
    }
    
}
