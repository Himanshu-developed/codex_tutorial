package DSA;

import java.util.Scanner;

public class rotationOfArray {
    static int []rotation(int arr[], int r){
        int n=arr.length;
        r = r % n;
        int temp[]= new int[n];

        int j=0;
        for(int i=n-r; i<n; i++){
           temp[j++]=arr[i];
        }
        for(int i=0; i<n-r; i++){
            temp[j++]=arr[i];
        }
        
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of element :: ");
        int size = sc.nextInt();
        System.out.println("Enter element of Array :: ");
        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Enter r :: ");
        int r = sc.nextInt();
        int ans[] = rotation(arr,r);
        System.out.println("Array after rotation :: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
