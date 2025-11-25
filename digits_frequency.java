import java.util.*;

public class digits_frequency{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("enter Your Numner");
        int n = scn.nextInt();

        System.out.println("Repetition Numner");
        int d = scn.nextInt();
        
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }
    public static int getDigitFrequency(int n, int d){
        // writing code
        int rv= 0;
        while (n > 0){
            int dig = n  % 10;
            n = n / 10;

            if(dig == d){
                rv++;
            }
            
        }
        return rv;
    }

}


