import java.util.Scanner;

public class evenNumberChecker {
    static String check(int num){
        if(num % 2 == 0 && num > 0){
            return "Even";
        }
        return "Odd";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :: ");
        int num = sc.nextInt();
        System.out.println( num+" is " + check(num));
    }
}
