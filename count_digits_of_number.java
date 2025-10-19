import java.util.*;

public class count_digits_of_number{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = scn.nextInt();

        int count = 0;
        while(n !=0 ){
            n = n / 10;
            count++;
        }

        System.out.println(count);
    
    }
}