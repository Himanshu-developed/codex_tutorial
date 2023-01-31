package DSA;

public class pointerSortedArray {
    static void sort(int arr []){
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=arr.length-1;j>=0;j--){
            if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
            }            
        }

        }
    }
    static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,3,2,1};
        System.out.println("before sorting :: ");
        printArray(arr);
        System.out.println();
        System.out.println("After sorting :: ");
        sort(arr);
        printArray(arr);

    }
}
