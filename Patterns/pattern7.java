import java.util.*;

public class pattern7{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("enter a number");
        int n = scn.nextInt();

        

        for(int i = 1; i <= n; i++) {

            for(int j = i; j <= i; j++){
                System.out.print("\t");
            }
            for(int j = i; j <= n; j++){
                System.out.print("*\t");
            }
            System.out.println();

       

        }

        
         
    }
}

