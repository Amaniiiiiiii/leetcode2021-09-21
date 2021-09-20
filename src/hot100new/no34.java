package hot100new;

public class no34 {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                ans[0] = i;
                while(nums[i]==target && i<nums.length){
                    i++;
                }
                ans[1] = i-1;
                return ans;
            }
        }
        return new int[]{-1,-1} ;
    }
}
