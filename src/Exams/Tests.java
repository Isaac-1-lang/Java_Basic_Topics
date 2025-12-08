package Exams;


import java.util.Arrays;

final public class Tests {
    public static void main(String[] args) {
        long bigger = 12L;
        int big = (int)bigger;


        int[] nums = {12,45,67,30,23,450,2101};
        System.out.println(Arrays.stream(nums).max().getAsInt());


        System.out.println(big);

        String a="Hello";
        String b="World";

        System.out.println(a==b);



        int x=2;
        switch (x) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
        }
    }
    int max(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
