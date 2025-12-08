package regexp;

import java.util.regex.*;

public class First {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("food|foo");
        Pattern p2 = Pattern.compile("\\w");
        Matcher m = p.matcher("foofoofood"); // Case sensitive
        Matcher m2 = p2.matcher("abc");
        System.out.println(m2.find());
        Pattern p3 = Pattern.compile("^(\\d{1,3}\\.){3}\\d{1,3}$");
        Matcher m3 = p3.matcher("10.10.10.650");

    }
}
