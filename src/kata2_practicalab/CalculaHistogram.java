package kata2_practicalab;


public class CalculaHistogram {
 
    public static <T> Histogram <T> computeHisto (T[] vector){
        Histogram <T> histo = new Histogram<>();
        
        for (T t : vector) {
            histo.increment(t);
        }
        
        return histo;
    }
}
