package Outside;

import java.util.Scanner;

public class StringMan {

    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String sb = sc.nextLine();
        StringBuilder s = new StringBuilder(sb);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' ||s.charAt(i)=='e' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='i' ) {
                s.setCharAt(i,'_');
            }
        }


        System.out.println(s);
    }
}
