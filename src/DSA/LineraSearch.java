package DSA;

import java.util.Scanner;

public class LineraSearch {
    static void search(int arr[], int key){

        for(int i=0; i<arr.length; i++){
            int temp=0;
            if(arr[i]==key){
               System.out.println("Key is found at "+i);
               temp=temp+1;
               break;
            }
            else if(temp>0) {
                System.out.println(key+" is not found.");
                break;
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:: ");
        int arr [] = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Enter key to search:: ");
        int key=sc.nextInt();
        search(arr,key);

    }
}
