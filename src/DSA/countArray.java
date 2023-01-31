package DSA;

public class countArray {
    static int count(int arr [], int x){
        int count=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
               count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
        int arr[] = {5,6,5,1,5};
        int x = 5;
        System.out.println("Counting of "+x+" ="+ count(arr,x));

    }
}
