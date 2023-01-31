package DSA;


public class containerWithMostWater {
    static int mostWater(int height[]){
        int left=0, right=height.length-1;
        int maxArea=0;
        
        while(left<right){
            int currArea=(right-left)*Math.min(height[left], height[right]);
            maxArea=Math.max(maxArea, currArea);

            if(height[left]<height[right]){
                left++;
            }
            else {
                right--;
            }
        }


        return maxArea;
    }
    public static void main(String[] args) {
        int height [] ={1,8,6,2,5,4,8,3,7};
        System.out.println("Max area = " + mostWater(height));
    }
}
