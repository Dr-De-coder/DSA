import java.util.*;
import java.io.*;

public class first_indexof_occurence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("enter data you want to find");
        int d = scn.nextInt();
        int fi = firstIndex(arr, 0, d);
        System.out.println(fi);
    }
    public static int firstIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == x){
            return idx;
        }else {
            int fiisa = firstIndex(arr, idx + 1, x);
            return fiisa;
        }
    }
}