import java.util.*;
// import java.util.Map.*;  

public class PrintInfo<K, V> {
    // K keys[];
    // V values[];
    HashMap<K, V> data = new HashMap<K, V>();// Creating HashMap

    public PrintInfo(HashMap<K, V> data) {
        this.data = data;
    }
    
    public void addData(K key, V value) {
        data.put(key, value);
    }


    public void printData() {
        data.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}
