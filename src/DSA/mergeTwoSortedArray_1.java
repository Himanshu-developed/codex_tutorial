package DSA;

public class mergeTwoSortedArray_1 {
    static void merge (int arr1[], int arr2[], int arr3[]){

        int n1=arr1.length;
        int n2=arr2.length;
        int i=0, j=0;
        int k=0;

        while(i<n1 && j<n2){
            if(arr1[i]>arr2[j]){
                arr3[k++]=arr2[j++];
            }
            else {
                arr3[k++]=arr1[i++];
            }
        }
        while(i<n1){
            arr3[k++]=arr1[i++];
        }
        while(j<n2){
            arr3[k++]=arr2[j++];
        }
        

    }
    
    public static void main(String[] args) {
        int arr1[]={1,3,5,7,9};
        int arr2[]={2,4,6,8};
        int arr3[]=new int[arr1.length + arr2.length];
        
        merge(arr1,arr2,arr3);
        
        for(int i=0; i<(arr1.length + arr2.length); i++){
            System.out.print(arr3[i]+" ");
        }

    }
}
