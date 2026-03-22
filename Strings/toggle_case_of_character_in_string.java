import java.io.*;
import java.util.*;

public class toggle_case_of_character_in_string {

    public static String toggleCase(String str){

        
        StringBuilder sb = new StringBuilder(str);

        for(int i = 0; i < sb.length(); i++){
            char ch = sb.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                char uch = (char)('A' + ch - 'a');   //uch = upperCase
                sb.setCharAt(i, uch);
            } else if(ch >= 'A' && ch <= 'Z'){
                char lch = (char)('a' + ch - 'A');
                sb.setCharAt(i, lch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the string");
        String str = scn.nextLine();
        System.out.println(toggleCase(str));
    }
}