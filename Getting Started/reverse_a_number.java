import java.util.*;

public class reverse_a_number{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your number");

        int n = scn.nextInt();

        while(n > 0){
            int dig = n % 10;
            n = n / 10;
            System.out.println(dig);
        }
        
    }
}