package hot100;

public class chengzuiduoshui {
    public int maxArea(int[] height) {
        int right = height.length-1;
        int left = 0;

        int max = Math.min(height[right],height[left]) * (right-left);
        while(left<right){
            if(height[right]>height[left])
                left++;
            else right--;

            max =  Math.max(max,Math.min(height[right],height[left]) * (right-left));

        }
        return max;
    }
}
