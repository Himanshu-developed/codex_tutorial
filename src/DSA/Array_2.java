package DSA;

import java.util.Scanner;

public class Array_2 {
    static int [] newArray(int a){
        Scanner sc = new Scanner (System.in);
        int arr [] = new int [a];
        for(int i=0; i<arr.length; i++){
             arr[i]=sc.nextInt();
        }

        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int a = 5;
        System.out.println(newArray(a));
    }
}