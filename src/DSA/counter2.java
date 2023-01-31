package DSA;

import java.util.Scanner;

public class counter2 {
    static int count(int num){
        int count =0;
        for(int i=2; i<=num; i++){
            if(num%i==0){
                count ++;
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number:: ");
        int num = sc.nextInt();
        System.out.println("Number of Even number:: ");
        System.out.println(count(num));
        System.out.println("Even number is::");
        for(int i=1; i<=num; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }

        }

    }
}
