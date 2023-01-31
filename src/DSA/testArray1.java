package DSA;

import java.util.Scanner;

public class testArray1 {
    // static void sort(int arr[]){
    //     for(int i=0; i<arr.length; i++){
            
    //     }
    //     int temp=0;
    //     for(int i=0; i=arr.length; i++){
    //         for(int j=1; j=arr.length-i; j++){
    //             if(arr[j-1]>arr[j]){
    //                 temp=arr[j-1];
    //                 arr[j-1]=arr[j];
    //                 arr[j]=temp;
    //             }
    //         }
    //     }

    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array :: ");
        int size = sc.nextInt();
        System.out.println("Enter element :: ");
        int arr[] = new int [size];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j-1]>arr[j]){
                   temp=arr[j-1];
                   arr[j-1]=arr[j];
                   arr[j]=temp;
                }
            }
        }
        System.out.println("After sorting :: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        }
    }

