package DSA;

public class Array_Greater {
    static  void greater(int arr[] , int x){
       int count = 0;
       for(int i=0; i<arr.length; i++){
        if(x>arr[i]){
            count++;
        }
       }
       System.out.println(x+" is greater than "+count+" elements.");

    }
    public static void main(String[] args) {
        int arr [] = {2,21,41,3,52,12,10};
        int x=21;

        int count=0;
        for(int i=0; i<arr.length; i++){
            if( arr[i] > x){
                count++;
            }
        }
        System.out.println(x+" is less than "+count+" elements.");
        greater(arr,x);
    }
}
