package DSA;

import java.net.SocketPermission;

public class BinarySearch {
    public static void main(String[] args) {
        
        int arr[]={ 12,14,30,47,51};
        int left=0, right=arr.length;
        int mid=0;
        int key=12;

        while(left<=right){
      
            mid=(left+right)/2;
            if(arr[mid]==key){
                System.out.println("Elements presents at index "+mid);
                return;
            }
            else if(arr[mid]<key){
                left=mid+1;

            }
            else if(arr[mid]>key){
                right=mid-1;

            }
        }
        System.out.println("Key not found.");
    }
}
