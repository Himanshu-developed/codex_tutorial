package DSA;

import java.util.Scanner;

public class maxAndMinArray {
    static void sort(int arr[]){
        int n=arr.length;
        int temp=0;
        for(int i=0; i<n; i++){
            for(int j=1; j<n-i; j++){
                if(arr[j-1] > arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    static void min(int arr[]){
        sort(arr);
        System.out.println("Minimum element = "+ arr[0]);
    }
    static void max(int arr[]){
        sort(arr);
        System.out.println("Maximum element = "+arr[arr.length-1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of element :: ");
        int size = sc.nextInt();
        System.out.println("Enter element : ");
        int arr[]= new int [size];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        min(arr);
        max(arr);
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }
    }
}
