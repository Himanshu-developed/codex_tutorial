package DSA;

public class reverseArrayWithpointer {
    static void reverse(int arr[]){
        int i=0, j=arr.length-1;
        int temp=0;
        while(i<j){
            if(arr[i] < arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
    }
    static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println("Array before reverse :: ");
        printArray(arr);
        System.out.println();
        System.out.println("Array after reversing :: ");
        reverse(arr);
        printArray(arr);

    }
}
