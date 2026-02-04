import java.io.*;
import java.util.*;

public class basics {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // String s1 = "Hello World";
        // String s1 = scn.nextLine();
        // String s2 = scn.next();
        // System.out.println(s1);
        // System.out.println(s2);

        // System.out.println("enter a string s");
        // String s = scn.next();
        // System.out.println(s);
        // System.out.println(s.length());

        //way to find any character from any given string

        // char ch = s.charAt(2);
        // System.out.println(ch);

        //for printing all the character in the string 

        // for(int i = 0; i < s.length(); i++){
        //     char ch = s.charAt(i);
        //     System.out.println(ch);
        // }

        // printting substring

        // String s = "abcd";
        // System.out.println(s.substring(2,1));

        //printing all string using loop

        // String s = "abcd";
        // for(int i = 0; i < s.length(); i++){
        //     for(int j = i + 1; j <= s.length(); j++){
        //         System.out.println(s.substring(i,j));
        //     }
        // }

        //Adding two Strings

        // String s1 = "Hello";
        // String s2 = "World";
        // String s3 = s1 + " " + s2;
        // System.out.println(s3);

        //printing strings int array from a single string

        String s = "abc def ghi jkl mno";
        String[] parts = s.split(" ");
        for(int i = 0; i < parts.length; i++){
            System.out.println(parts[i]);
        }

        
    }
}
 