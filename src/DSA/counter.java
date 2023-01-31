package DSA;

import java.util.Scanner;

public class counter {
    static int count(int x){
        int count=0;
        for(int i=1; i<=x;i++){
            if(x%i==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:: ");
        int x= sc.nextInt();
        System.out.println("No of factor= "+count(x));
        
        if(count(x)==2){
           System.out.println(x+" is prime number.");
        }
        else {
            System.out.println(x+" is not prime number.");
        }
        
    }
}
