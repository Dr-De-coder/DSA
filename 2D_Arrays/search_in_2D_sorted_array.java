import java.io.*;
import java.util.*;

public class search_in_2D_sorted_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("enter the no. of rows");
        int n = scn.nextInt();

        System.out.println("enter the no. of columns");
        int m = scn.nextInt();

        int[][] arr = new int[n][m];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        System.out.println("enter the value of x");
        int x = scn.nextInt();

        int i = 0;
        int j = arr[0].length -1 ;
        while(i < arr.length && j >= 0){
            if(x == arr[i][j]){
                System.out.println(i);
                System.out.println(j);
                return;
            }else if(x < arr[i][j]){
                j--;
            }else {
                i++;
            }
        }

        System.out.println("Not Found");
    }
}
 