package catPrep;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args) {
        Map district=new HashMap();
        district.put("Uganda",3);
        district.put("<UNK>","<UNK>");
        district.put("<UNK>","<UNK>");
        System.out.println(district.get("Uganda"));
    }
}
