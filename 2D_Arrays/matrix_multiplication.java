import java.io.*;
import java.util.*;

public class matrix_multiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the r1 number of matrics");
        int r1 = scn.nextInt();
        System.out.println("Enter the c1 number of metrics");
        int c1 = scn.nextInt();

        int[][] one = new int [r1][c1];
        for(int i = 0; i < one.length; i++){
            for(int j = 0; j < one[0].length; j++){
                one[i][j] = scn.nextInt();
            }
        }

        System.out.println("Enter the r2 number of matrics");
        int r2 = scn.nextInt();
        System.out.println("Enter the c2 number of metrics");
        int c2 = scn.nextInt();

        int[][] two = new int [r2][c2];
        for(int i = 0; i < two.length; i++){
            for(int j = 0; j < two[0].length; j++){
                two[i][j] = scn.nextInt();
            }
        }
        if(c1 != r2){
            System.out.println("Invalid input");
            return;
        }

        
        int[][] prd = new int[r1][c2];
        for(int i = 0; i < prd.length; i++){
            for(int j = 0; j < prd[0].length; j++){
                for(int k = 0; k < c1; k++){
                    prd[i][j] += one[i][k] * two[k][j];
                }
            }
        }

        for(int i = 0; i < prd.length; i++){
            for(int j = 0; j < prd[0].length; j++){
                System.out.print(prd[i][j] + " ");
            }
            System.out.println();
        }
    }
}
