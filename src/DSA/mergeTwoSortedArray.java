package DSA;

public class mergeTwoSortedArray {
    static void sort(int arr []){
        int temp=0;
        for (int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        
        int arr1[]={1,5,6,10};
        int n1=arr1.length;
        int arr2[]={2,3,7,8,9};
        int n2=arr2.length;
        int arr3 [] = new int[n1+n2];
        int i=0, j=0;
        int k=0;
        while(i<n1){
            arr3[k++]=arr1[i++];
        }
        System.out.println();
        while(j<n2){
            arr3[k++]=arr2[j++];
        }
        System.out.println(arr3[i]);
        System.out.println("New array after merging :: ");        
        for( i=0; i<(n1+n2); i++){
            System.out.print(arr3[i]+" ");
        }
        sort(arr3);
        System.out.println("Array after sorting :: ");
        for( i=0; i<(n1+n2); i++){
           System.out.print(arr3[i]+" ");
        }
    }
}
