import java.util.*;

public class is_number_prime{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // System.out.println("enter your number");
        int t = scn.nextInt();

        for(int i = 0; i < t; i++){
            int n = scn.nextInt();

            int count = 0;
            for(int div = 2; div*div <=n; div++){
                if(n % div == 0){
                    count++;
                    break;
                }
            }

            if(count == 0){
                System.out.println("prime");

            }else {
                System.out.println("not prime");
            }
        }
        
    }
}

