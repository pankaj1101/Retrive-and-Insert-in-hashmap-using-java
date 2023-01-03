import java.util.HashMap;
import java.util.Map;

public class hashmap {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        // Different ways to create hashmap
        // HashMap<String, Integer> map = new HashMap<>();
        // HashMap<Integer, Integer> map = new HashMap<>();
        // HashMap<Integer, String> map = new HashMap<>();

        // To insert values into Hashmap
        map.put("A", "1");
        map.put("B", "2");
        map.put("C", "3");
        map.put("D", "4");
        map.put("E", "5");

        //To print hashmap 
        System.out.println(map);

        // To check key present or not in the map..
        if (map.containsKey("A")) {
            System.out.println("key is present");
        } else {
            System.out.println("key is not present");
        }

        // To get the values from hashmap using key
        System.out.println(map.get("E"));

        // To get key value pair..
    
        for (Map.Entry<String, String> e : map.entrySet()) {
            System.out.println(e.getKey() + "=" + e.getValue());
        }

    }
}
