import java.io.*;
import java.util.*;

public class diagonal_traversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter number of rows n ");
        int n = scn.nextInt();
        
        System.out.println("enter number of colums m ");
        int m = scn.nextInt();

        int[][] arr = new int[n][m];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        for(int g = 0; g < arr.length; g++){
            for(int i = 0, j = g; j < arr.length; i++ , j++){
                System.out.println(arr[i][j]);
            }
        }


        
    }
}
 