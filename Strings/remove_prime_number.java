import java.io.*;
import java.util.*;

public class remove_prime_number {
    public static boolean isPrime(int val){
        if (val <= 1){
            return false;
        }
        for(int div = 2; div * div <= val; div++){
            if(val % div == 0){
                return false;
            }
        }

        return true;
    }

    public static void solution(ArrayList<Integer>a1){
        for(int i = a1.size() - 1; i >= 0; i--){
            int val = a1.get(i);
            if(isPrime(val) == true){
                a1.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the numbers n");
        int n = scn.nextInt();
        ArrayList<Integer> a1 = new ArrayList<>();
        for(int i = 0; i < n; i++){
            a1.add(scn.nextInt());
        }
        solution(a1);
        System.out.println(a1);
    }
}