package hot100new;

import java.util.ArrayList;
import java.util.List;

public class no46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();

        backtrack(nums,ans,combination,0);
        return ans;
    }

    public void backtrack(int[] nums, List<List<Integer>> ans,List<Integer> combination, int index){
        if(combination.size()==nums.length) {
            ans.add(new ArrayList<>(combination));
            return ;
        }

        for (int i = 0; i < nums.length; i++) {
            combination.add(nums[i]);
            backtrack(nums,ans,combination,index+1);
            combination.remove(combination.size()-1);
        }



    }
}
