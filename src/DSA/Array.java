package DSA;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        
        int [] arr = {12,2,1,45,12};

        System.out.println("Array before sorting ::");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.println("After sorting :: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
