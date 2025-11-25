import java.util.*;

public class anybase_to_decimal{

    public static int getValueInBase(int n, int b){
        // writing code
        int rv = 0;

        int p = 1;          //P= positional multiplier
        while(n > 0){
            int dig = n % 10;
            n = n / 10;

            rv += dig * p;
            p = p * b;
        }
        return rv;
    }



    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("enter Your Number");
        int n = scn.nextInt();

        System.out.println("Enter base");
        int b = scn.nextInt();
        
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }


}



