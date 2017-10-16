package javaapplication2;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Histogram<T> {

    private final Map<T,Integer> map = new HashMap<>();

    public Integer get(T key) {
        return map.get(key);
    }

    public Set<T> keySet() {
        return map.keySet();
    }
    
    public Integer increment (T key){
        return map.put(key, map.containsKey(key) ? get(key)+1 : 1);
    }
    
}