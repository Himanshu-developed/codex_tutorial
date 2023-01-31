package DSA;

public class method{
    static boolean isOdd(int num){
        if(num>0 && num %2 ==0){
            return false;
        }
        return true;
    }
    static int sumOdd(int a, int b){
        
        int sum=0;
        for(int i=a; i<=b; i++){
            if(i % 2 != 0){
                sum = sum +i;

            }
        }
            if (a < b && a<0 && b<0){
                return sum;
            }
            else if(a>b || a<0 || b<0){
                return -1;
            }
            else {
                if (a==b){
                    return sum;
                }
                else {
                    return 0;
                }
            }
        
     
    }
    // static int range(int a, int b){
    //     int count =0;
    //     for(int i = a; i <= b; i++){
    //         if (i % 2 != 0){
    //              count ++;
    //         }
    //     }
    //     return count;
    // }
    public static void main(String[] args) {
        
        System.out.println("sum is= "+ sumOdd(1,11));
        
    }
}