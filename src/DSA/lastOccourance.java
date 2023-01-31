package DSA;

public class lastOccourance {
    public static void main(String[] args) {
        int arr[] ={5,2,5,6,3,1,5};

        int x=5;
        int last = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                last=i;
            }
        }
        System.out.println("Found at index = "+last);
    }
}
