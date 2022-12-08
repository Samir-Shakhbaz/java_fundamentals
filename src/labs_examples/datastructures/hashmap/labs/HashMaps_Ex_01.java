package labs_examples.datastructures.hashmap.labs;

import java.util.HashMap;

//        *  put()
//        *  get()
//        *  putAll()
//        *  size()
//        *  contains()
//        *  keySet()
//        *  entrySet()
//        *  putIfAbsent()
//        *  remove()
//        *  replace()
//        *  forEach()
//        *  clear()

public class HashMaps_Ex_01 {

    public static void main(String[] args) {

        HashMap<String, Integer> myHashMap = new HashMap<>();

            myHashMap.put("Coca-Cola", 50);
            myHashMap.put("Pepsi-Cola", 45);
            myHashMap.put("Dr.Pepper", 48);
            myHashMap.put("Coors", 30);
            myHashMap.put("Minute Maid", 40);

        System.out.println(myHashMap);

        System.out.println(myHashMap.get("Coors"));

        HashMap<String, Integer> newMyHashMap = new HashMap<>();
            newMyHashMap.putAll(myHashMap);
            System.out.println(newMyHashMap);

        System.out.println(newMyHashMap.size());

        System.out.println(newMyHashMap.containsKey("Coca-Cola"));

        System.out.println(newMyHashMap.keySet());

        System.out.println(newMyHashMap.entrySet());

        newMyHashMap.putIfAbsent("Mountain Dew", 60);
        System.out.println(newMyHashMap);

        newMyHashMap.remove("Fanta");
        System.out.println(newMyHashMap);

        newMyHashMap.replace("Coca-Cola", 50, 80);
        System.out.println(newMyHashMap);

        newMyHashMap.forEach((key, value) -> {
            value = value * 2;
            newMyHashMap.replace(key, value);

        });
        System.out.println(newMyHashMap);

        newMyHashMap.clear();
        System.out.println(newMyHashMap);

    }

}
