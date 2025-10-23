import java.util.*;

public class GCD_LCM_OF_TWO_NUMBERS{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter your number: ");
        int n1 = scn.nextInt();
        System.out.print("enter your number: ");
        int n2 = scn.nextInt();

        int on1 = n1;
        int on2 = n2;  //original n1 and original n2

        while(n1 % n2 != 0){
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }

        int gcd = n2;
        int lcm = (on1 * on2) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);

    
    }
}

