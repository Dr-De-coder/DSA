import java.io.*;
import java.util.*;

public class strings_with_ASCII_diff_of_character {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the string");
        String str = scn.next();
        
        System.out.println(solution(str));
    }

    public static String solution(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        for(int i = 0; i < sb.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            int gap = curr - prev;

            sb.append(gap);
            sb.append(curr);
        }

        return sb.toString();
    }
}