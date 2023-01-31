package DSA;

public class returnArray {
    static int []get(){
        // int arr []={1,2,3,4,5};
        // return arr;
        return  new int[]{1,2,3,4,5};
    }
    public static void main(String[] args) {
        int arr[]=get();
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
