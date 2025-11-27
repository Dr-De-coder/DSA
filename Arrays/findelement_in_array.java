package Arrays;
import java.util.Scanner;

public class findelement_in_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter number n");
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        System.out.println("enter data");
        int data = scn.nextInt();

        int idx = -1;
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] == data){
                idx = i;
                break;
            }
        }
        System.out.println(idx);
    }
}
