package DSA;

import java.util.*;

public class biotonic {

    static int  binarysearch(ArrayList aList, int key){
        int left=0;
        int right= aList.size()-1;
        int mid=(left+right)/2;
        while(left<=right){
            mid=(left+right)/2;
            if((int)aList.get(mid)==key){
                return mid;
            }
            if((int)aList.get(mid)>key){
                right=mid-1;
            }
            else if((int)aList.get(mid)<key){
                left=mid+1;
            }
        }
        return -1;
    }
    static int SearchElement(int arr[], int key, int biotonicIndex ){
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i=0;i < biotonicIndex;i++){
            arr1.add(arr[i]);
        }
        if(key==arr[biotonicIndex]){
            return biotonicIndex;
        }
        int flag=binarysearch(arr1, key);
        if(flag!=-1){
            return flag;
        }
        else{
            arr1.clear();
            for(int i=biotonicIndex+1;i<arr.length;i++){
                arr1.add(arr[i]);
            }
            Collections.sort(arr1);   
            flag=binarysearch(arr1, key);
            if(flag!=-1){
                for(int i=0;i<arr.length;i++){
                    if(arr[i]==arr1.get(flag)){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
    static int findBitonicPoint(int arr[]){
        int left=0;
        int right=arr.length-1;
        int mid=(left+right)/2;
        while(arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid]){
            if(arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid]){
                return mid;
            }
            if (arr[mid-1]<arr[mid] && arr[mid+1]>arr[mid]){
                left=mid+1;
                mid=(left+right)/2;
            }
            else if(arr[mid-1]>arr[mid] && arr[mid+1]<arr[mid]){
                right=mid-1;
                mid=(left+right)/2;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={23,24,25,26,5,4,3,2};
        int bIndex=findBitonicPoint(arr);
        int elementIndex=SearchElement(arr, 2, bIndex);
        if(elementIndex!=-1){
            System.out.println("Element Present at:: "+ elementIndex);
            return;
           
        }   
        System.out.println("Element no found "); 
        return;
    }        
        
}
