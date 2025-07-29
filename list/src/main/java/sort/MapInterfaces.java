package sort;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaces {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"apple");
        map.put(2,"banana");
        map.put(3,"orange");

        System.out.println("map interfaces:"+map);
        System.out.println("fruits with Id 2 :" +map.get(2));

        System.out.println("iterate over maps:");
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println("id:"+entry.getKey()+" "+"fruits:"+entry.getValue());
        }
    }
}
