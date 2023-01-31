package DSA;

public class trappingRainWater {
    static int trapRainWater(int arr[]){
        int left=0;
        int right=arr.length-1;
        int mid=left+right/2;
        int leftHighestElement=0;
        int rightHighestElement=0;
        int waterTrapped=0;
        for(int i=left;i<=mid;i++){
            if(arr[i]>arr[leftHighestElement]){
                leftHighestElement=i;
            }
        }
        for(int i=mid;i<=right;i++){
            if(arr[i]>arr[rightHighestElement]){
                rightHighestElement=i;
            }
        }
        if(arr[leftHighestElement]<arr[rightHighestElement]){
            for(int i=leftHighestElement;i<rightHighestElement;i++){
                waterTrapped+=Math.abs(arr[leftHighestElement]-arr[i]);
            }
        }
        else if(leftHighestElement==rightHighestElement){
            for(int i=mid;i>=left;i--){
                waterTrapped+=Math.abs(arr[mid]-arr[i]);
            }
            for(int i=mid;i<=right;i++){
                waterTrapped+=Math.abs(arr[mid]-arr[i]);
            }
        }
        else{
            for(int i=rightHighestElement;i>leftHighestElement;i--){
                waterTrapped+=Math.abs(arr[rightHighestElement]-arr[i]);
            }
        }
        return waterTrapped;
    }
    public static void main(String[] args) {
        int arr[]={7,5,9,4,7};
        System.out.println(trapRainWater(arr));
    }
}
