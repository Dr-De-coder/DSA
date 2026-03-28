import java.util.*;
import java.io.*;

public class Lastindexof_occurenceinAray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int li = lastIndex(arr, 0, x);
        System.out.println(li);
    }
    public static int lastIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }
        int lissa = lastIndex(arr, idx + 1, x);
        if(lissa == -1){
            if(arr[idx] == x){
                return idx;
            }else{
                return -1;
            }
        }else {
            return lissa;
        }
    }
}