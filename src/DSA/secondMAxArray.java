package DSA;

import java.util.Scanner;

public class secondMAxArray {
    static int secondMax(int arr[]){
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max=arr[i];                         
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==max){
                arr[i]=-1;
                max=arr[i];
            }
        }
    
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max=arr[i];
            }
        }
        
        return max;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :: ");
        int size = sc.nextInt();
        System.out.println("Enter element :: ");
        int arr[]=new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Second maximum element = " + secondMax(arr));
    }
}
