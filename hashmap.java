import java.util.HashMap;
import java.util.Map;

public class hashmap {

    public static void main(String[] args) {

        HashMap<String, String> hash = new HashMap<>();

        hash.put("A", "1");
        hash.put("B", "2");
        hash.put("C", "3");
        hash.put("D", "4");
        hash.put("E", "5");
        
        System.out.println(hash);

        // To check key present or not in the hashmap..
        if (hash.containsKey("A")) {
            System.out.println("key is present");
        } else {
            System.out.println("key is not present");
        }

        // To get the values from hashmap
        System.out.println(hash.get("E"));

        // To get key value pair..
        for (Map.Entry<String, String> e : hash.entrySet()) {
            System.out.println(e.getKey() + "=" + e.getValue());
        }

    }
}