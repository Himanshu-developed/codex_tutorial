package DSA;

public class Recursion2 {
    static int sum(int a, int b){
        if(a<=b){
            return a+sum(a+1,b);
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println("Sum = " + sum(5,10));
    }
}
