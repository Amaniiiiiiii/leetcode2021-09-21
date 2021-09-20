package hot100new;

public class no11 {
    public int maxArea(int[] height) {
        //两个for
        int right;
        int max=0;
        int maxTemp=0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i; j < height.length; j++) {
                int contain = Math.min(height[j],height[i])*(j-i);
                maxTemp = Math.max(maxTemp,contain);
            }
            max = Math.max(max,maxTemp);
        }
        return max;
    }

    public int maxArea2(int[] height){
        //双指针
        int left=0;
        int right=height.length-1;
        int max= 0;
        while(left<right){
            int contain = Math.min(height[left],height[right])*(right-left);
            if(height[left]>height[right]){
                right--;
            }
            else left++;
            max = Math.max(contain,max);
        }
        return max;
    }
}
