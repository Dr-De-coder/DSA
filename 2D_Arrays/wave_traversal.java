import java.io.*;
import java.util.*;

public class wave_traversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter no of row n");
        int n = scn.nextInt();
        System.out.println("enter no. of column m");
        int m = scn.nextInt();

        int[][] arr = new int[n][m];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        for(int j = 0; j < arr[0].length; j++){
            if(j % 2 == 0){
                for(int i = 0; i < arr.length; i++){
                    System.out.println(arr[i][j]);
                }
            } else{
                for(int i = arr.length - 1; i >= 0; i--){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}
 