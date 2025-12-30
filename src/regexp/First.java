package regexp;

import java.util.regex.*;

public class First {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(\\d\\d)");

        Matcher m = p.matcher("287987987");
        System.out.println(m.find());

    }
}
