package DSA;

import java.util.Scanner;

public class whileFunction {

    static int add(int num){
        int i=1;
        int sum=0;
        while(i<=num){
            System.out.print(i+" ");
            sum=sum+i;
            i++;
            

        }
        System.out.println();
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print sum ::");
        int num = sc.nextInt();
        System.out.println("sum of "+ num +" number = "+add(num));
        // add(num);
    }
}
