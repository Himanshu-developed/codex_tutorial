package DSA;

import java.util.Scanner;

public class Array2{
    static int count(int arr[], int x){
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:: ");
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:: ");

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter num to count:: ");
        int x = sc.nextInt();
        System.out.println("Number of "+x+" is= "+count(arr,x));

    }
}