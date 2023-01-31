package DSA;

import java.util.Scanner;

public class Recursion1 {
    static void sum(int num){
        if(num==0){
            return ;
        }
        System.out.print(num + " ");
        sum(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :: ");
        int num = sc.nextInt();
        sum(num);
        System.out.println();
    }
}
