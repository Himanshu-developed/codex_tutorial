import java.util.Scanner;

public class counterWhile {

    static int counter(int num){
        int i=1;
        int sum=0;
        int count = 0;
        while(i<=num){
            if(i % 2 ==0){
               count ++;
               sum =sum + i;
               System.out.print(i+" ");
            }
            i++;
        }
        System.out.println();
        System.out.println("sum = "+ sum);
        return count;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:: ");
        int num = sc.nextInt();
        System.out.println("counting = "+counter(num));
    }
}
