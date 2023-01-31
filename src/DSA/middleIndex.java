package DSA;

public class middleIndex {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        int left=0,right=arr.length-1;
        int mid=0;
        // int count=0;
        for(int i=0; i<arr.length;i++){
            mid=(left+right)/2;
            
        }
        System.out.println("mid element is present at index "+mid);
        System.out.println("Mid element = " + arr[mid]);
        System.out.println("no of elements= "+arr.length);
    }
}
