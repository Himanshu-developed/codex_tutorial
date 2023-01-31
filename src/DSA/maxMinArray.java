package DSA;

public class maxMinArray {
    static void max(int arr[]){
        int n=arr.length;
        
        int maxnum=0;
        
        for(int i=0; i<n; i++){
            if(arr[i] > maxnum){
                maxnum=arr[i];
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {5,2,7,8,1,3,6,9};
        max(arr);
    }
}
