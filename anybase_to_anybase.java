import java.util.*;

public class anybase_to_anybase{

    public static int getValueInBase(int n, int b1, int b2){
        // writing code
        int rv = 0;

        int p = 1;          //P= positional multiplier
        while(n > 0){
            int dig = n % b2;
            n = n / b2;

            rv += dig * p;
            p = p * b1;
        }
        return rv;
    }



    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("enter Your Number");
        int n = scn.nextInt();

        System.out.println("Enter base b1");
        int b1 = scn.nextInt();

        System.out.println("Enter output b2");
        int b2 = scn.nextInt();
        
        int dn = getValueInBase(n, b1, b2);
        System.out.println(dn);
    }


}



