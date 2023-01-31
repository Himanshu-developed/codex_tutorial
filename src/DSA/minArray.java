package DSA;

import java.util.Scanner;

public class minArray {
    static int min(int arr []){
        int mn=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<mn){
                mn=arr[i];
            }
        }
            
        return mn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :: ");
        int size = sc.nextInt();
        System.out.println("Enter element :: ");
        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Min = " + min(arr));
    }
}
