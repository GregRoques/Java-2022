import java.util.Map;
import java.util.HashMap;

/*

Put Method: 
The java.util.HashMap.put() method of HashMap is used to insert a mapping into a map. 
This means we can insert a specific key and the value it is mapping to into a particular map. 
If an existing key is passed then the previous value gets replaced by the new value. 
If a new pair is passed, then the pair gets inserted as a whole.

Ex:
map.put("key", "value")

 */

public class MapInterface {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        // importing class that implements Map, as map is an interface;
        // notice in the diamond brackets we define both the key and value as "String"
        map.put("Favorite_Black_Cat", "Midnight");
        map.put("Favorite_fluffy_cat", "Callie");
        map.put("Favorite_small_cat", "Lil' Nacheaux");

        System.out.println(map);
        // returns "{Favorite_Black_Cat=Midnght, Favorite_fluffy_cat=Callie, Favorite_small _cat=Lil' Nacheaux}"
        // may be out of order b/c I used "HashMap"

        System.out.println(map.get("Favorite Black Cat")) // returns Midnight;

        //if you want to loop through them

        Set<String> keys = map.keySet(); 
        // gets a set -- remember set has unique values only, no duplicates -- of keys

        for(String key: keys){
            System.out.println(key + " = " + map.get(key)); // prints each line-by-line
        }

    }
}
