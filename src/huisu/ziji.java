package huisu;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class ziji {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();

        backtrack(ans,combination,nums,0);
        return ans;
    }

    public void backtrack(List<List<Integer>> ans, List<Integer> combination, int[] nums, int first){
        ans.add(new ArrayList<>(combination));
        for (int i = first; i < nums.length; i++) {
            combination.add(nums[i]);
            backtrack(ans,combination,nums,i+1);
            combination.remove(combination.size()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new ziji().subsets(new int[]{1,2,3}));
    }
}
