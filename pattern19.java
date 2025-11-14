import java.util.*;

public class pattern19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter an odd number (>=5): ");
        int n = scn.nextInt();

        if (n < 5 || n % 2 == 0) {
            System.out.println("Please enter an odd number greater than or equal to 5.");
            return;
        }

        int mid = n / 2 + 1; // middle row / column

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Top row: left half filled and rightmost column
                if (i == 1) {
                    if (j <= mid || j == n) System.out.print("*\t");
                    else System.out.print("\t");
                }
                // Upper part (between top and middle): rightmost column and middle column
                else if (i < mid) {
                    if (j == mid || j == n) System.out.print("*\t");
                    else System.out.print("\t");
                }
                // Middle row: full row of stars
                else if (i == mid) {
                    System.out.print("*\t");
                }
                // Lower part (between middle and bottom): leftmost column and middle column
                else if (i < n) {
                    if (j == 1 || j == mid) System.out.print("*\t");
                    else System.out.print("\t");
                }
                // Bottom row: leftmost column and right half filled
                else { // i == n
                    if (j == 1 || j >= mid) System.out.print("*\t");
                    else System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
