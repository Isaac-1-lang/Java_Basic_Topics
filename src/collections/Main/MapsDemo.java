package collections.Main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapsDemo {
    public static void main(String[] args) {
       Map<int[], Integer> map = new HashMap<int[], Integer>();
       map.put(new int[] {1,2,3,4,5}, 1);
       map.put(new int[] {1,2,3,4,5}, 2);
       map.put(new int[] {1,2,3,4,5}, 3);
       map.put(new int[] {1,2,3,4,5}, 4);
       map.put(new int[]{1,2,3,4,5}, 5);
       Set<String> ss= new HashSet<String>();
       ss.add("Isaac");
       ss.add("isaac");
       ss.add("isaAc");
        System.out.println(ss.size());

       Map<String,Integer> districtCode = new HashMap<String,Integer>();
       districtCode.put("Gasabo",1);
       districtCode.put("Nyarugenge",2);
       districtCode.put("Kicukiro",3);
       // Printing key value pair
        for(Map.Entry<int[], Integer> entry : map.entrySet()){

        }
    }
}
