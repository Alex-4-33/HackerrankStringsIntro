import java.util.Scanner;

import static java.lang.System.*;

public class Hackerrank_Strings_Intro {

    public static void main(String[] args){
        Scanner sc=new Scanner(in);
        System.out.println("Enter string A:");
        String A=sc.next();
        System.out.println("Enter string B:");
        String B=sc.next();

        int a_length = A.length();
        int b_length = B.length();
        //System.out.println("!!");
        System.out.println(a_length + b_length); //Output sum of the lengths of A and B

        int comparison = A.compareTo(B) ;
        if (comparison > 0) {
            System.out.println("Yes");
        } //write Yes if A is lexicographically greater than B, otherwise print No instead
        else
            System.out.println("No");

        String a1 = A.substring(0, 1).toUpperCase();
        String ACapitalized = a1 + A.substring(1);
        String b1 = B.substring(0, 1).toUpperCase();
        String BCapitalized = b1 + B.substring(1);
        System.out.println(ACapitalized + " " + BCapitalized); // capitalize the first letter in both A and B
        // then print them on a single line, separated by a space

    }//end of main

}//end of class
