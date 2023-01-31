package DSA;

import java.util.Scanner;

public class maxArray {
    static int max(int arr[]){
        int mx=Integer.MIN_VALUE;
        
        for( int i=0; i<arr.length; i++){
            if(arr[i]>mx){
                mx=arr[i];
               
            }
        }
        
        return mx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :: ");
        int size = sc.nextInt();
        System.out.println("Enter elements :: ");
        int arr [] = new int [size];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Maximum = " + max(arr));
    }
}
