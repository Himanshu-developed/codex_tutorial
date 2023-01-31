package DSA;

public class Array_1 {
    public static void main(String[] args) {
        
        // int arr [] = new int [] {1,2,3};
        // for (int i = 2; i>=0; i--){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        int a[];
        a= new int [5];
        for (int i =0; i <a.length; i++){
            a[i]=a.length-i;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for(int element : a){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println(a);
    }
}
