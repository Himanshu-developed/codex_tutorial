package DSA;

import java.util.Scanner;

public class stockMarket {
    static int maxProfit(int prices[]){
       int maxProfit=0;
       for(int i=0; i<prices.length-1; i++){
        for(int j=i; j<prices.length; j++){
            int profit=prices[j]-prices[i];
            if(profit>maxProfit){
                maxProfit=profit;
            }
        }
       }
        return maxProfit;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter size of array :: ");
        // int size = sc.nextInt();
        // System.out.println("Enter element :: ");
        // int arr[] = new int [size];
        int prices[] = {7,1,5,3,6,4};
        // for(int i=0; i<arr.length; i++){
        //     arr[i]=sc.nextInt();
        // }
        System.out.println("Max profit = " + maxProfit(prices));
    }
}
