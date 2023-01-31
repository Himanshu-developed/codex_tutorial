package DSA;

public class countArray_1 {
    public static void main(String[] args) {
        int arr[] ={1,2,4,1,5,1,6,1,3,1};
        int x= 1;

        int count=0;
         for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                count ++;
            }
         }
         System.out.println("Counting of "+x+" = "+count);
    }
}
