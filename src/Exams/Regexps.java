package Exams;

import java.util.Scanner;
import java.util.regex.*;

public class Regexps {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(manipulateText(s));
    }
    public static String manipulateText(String text) {
        Pattern p1 =  Pattern.compile("[b-df-hj-np-tv-zB-DF-HJ-NP-TV-Z]+");
        Matcher m1 = p1.matcher(text);
        String returned = "";
        while (m1.find()) {
            returned += m1.group();
            int start1 = m1.start();
            int end1 = m1.end();
        }


        return returned;
    }
}
