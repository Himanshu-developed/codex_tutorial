package DSA;

import java.util.*;

public class rotationalArray {
    static int binarysearch(int arr[], int key){
        int left=0, right=arr.length-1;
        int mid=(left+right)/2;
        while(left<=right){
            mid=(left+right)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]>key){
               right=mid-1;
            }
            else if(arr[mid]<key) {
              left=mid+1;
            }
        }
        return -1;
    }

    static int bitonicpoint(int arr[]){
        int left=0;
        int right=arr.length-1;
        int mid=(left+right)/2;
        while(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                mid=(left+right)/2;
            }
            else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]){
                mid=(left+right)/2;
            }
        }
        return -1;
    }

    static int searchindex(int arr[], int key,int left, int right){
        
        left=0;
        right=bitonicpoint(arr);
        int arr1[] = new int[right-left];
        for(int i=0; i<right-left; i++){
            arr1[i]=arr[i];
        }
        if(key==arr[right]){
            return right;
        }
        int flag=binarysearch(arr1, key);
        if(flag != -1){
            return flag;
        }
        else {
            right=arr.length;

            int arr2[] = new int[right -left];
            left=bitonicpoint(arr);
            for(int i=left; i<right; i++){
                arr2[i]=arr[i];
                System.out.println(arr2[i]);
             }    
                flag=binarysearch(arr2, key);
                if(flag != -1){
                    for(int i=0; i<arr.length; i++){
                        if(arr[i]==arr2[flag]){
                            return i;
                        }
                    }
                }
        }
        

        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        // int left=arr[0];
        int left=0;
        int right=arr.length;
        int key=1;
        int elementIndex=searchindex(arr, key, left, right);
        if(elementIndex != -1){
            System.out.println("Element found at index "+elementIndex);
            return ;
        }
        System.out.println("Element not found ");
    }
}
