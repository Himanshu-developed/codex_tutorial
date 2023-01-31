package DSA;

public class maxMin {
    static int min(int arr[]){
        int min=arr[0];
        
        for(int i=1; i<arr.length; i++){
            if(min > arr[i]){
                min=arr[i];
            }
        }
        return min;
    }

    static int max(int arr[]){
        int max=arr[0];

        for(int i=1; i<arr.length; i++){
            if(max < arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    // static void smax(int arr[]){
    //     for(int i=0; i<arr.length-1; i++){
    //         if(arr[i]>arr[i+1]){
    //             arr[i+1]=arr[i];
    //         }
    //     }
    //     System.out.println(arr[0]);
    // }
    public static void main(String[] args) {
        int [] arr={33,3,2,4,5,6};
        System.out.println("Minimum element = " + min(arr));
        System.out.println("Maximum element = " + max(arr));
        // smax(arr);
    }
}
