package DSA;
import java.util.Arrays;
public class smallestAndGreatestArray {
    public static void main(String[] args) {
        int arr[]={5,8,1,3,6,2};
        Arrays.sort(arr);
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }
        System.out.println("smallest: "+arr[0]);
        System.out.println("largest: "+arr[arr.length-1]);

    }
}
