package DSA;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[]={10,14,21,9,20,45,30,25};
        System.out.println("Before sorting:: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int temp=0;
        System.out.println("After sorting:: ");

        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
