package hot100;

public class shanchushuzuzhongchongfu {
    public int removeDuplicates(int[] nums) {
        int space= 0;
        int res = 1;
        for (int i = 1; i <nums.length; i++) {
            if(nums[i]!=nums[i-1]){
                res++;
                nums[i-space]=nums[i];
            }else{
                space++;
            }
        }
        return res;
    }
}
