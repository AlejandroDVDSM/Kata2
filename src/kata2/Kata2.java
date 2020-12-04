package kata2;

import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        
        Integer [] data = {5, 8, 6, 3, 7, 4, 1, 0, 0, 2, 5, 8, 0, 6, 1};
        String [] data2 = {"Alejandro", "Sergio", "David", "David", "Carlos", "Elena", "Alejandro", "Elena", "Patricia", "Sergio"};
        
        Histogram meta_histogram = new Histogram(data);
        
        Map<Integer, Integer> histogram = meta_histogram.getHistogram();
        
        Iterator<Map.Entry<Integer, Integer>> entries = histogram.entrySet().iterator();
        
        while (entries.hasNext()) {
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());     
        }
    }
}
