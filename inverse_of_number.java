import java.util.*;

public class inverse_of_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter your number: ");
        int n = scn.nextInt();

        
        int inv = 0;
        int op = 1;            //original position

        while (n != 0) {
            int od = n % 10;  // original digit
            int id = op;      // inverted digit
            int ip = od;      // inverted position

            // only valid for digits between 1 and number length
            inv = inv + id * (int)Math.pow(10, ip - 1);

            n = n / 10;
            op++;
        }

        System.out.println("Inverse: " + inv);
    }
}
