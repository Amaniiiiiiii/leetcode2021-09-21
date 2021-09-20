package huisu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class  zuhezonghe {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        LinkedList<Integer> combination = new LinkedList<>();

        backtrack(candidates,target,0,combination,ans);
        return ans;
    }

    public void backtrack(int[] candidates,int target,int first,LinkedList combination,List<List<Integer>> ans){
        if(first==candidates.length) return;
        if(target ==0 ) {
            ans.add(new ArrayList<>(combination));
            return ;
        }
        //情况1 不选择这个数 直接跳过
        backtrack(candidates,target,first+1,combination,ans);
        //情况2 选择这个数
        if(target- candidates[first]>=0){
            combination.add(candidates[first]);
            backtrack(candidates,target-candidates[first],first,combination,ans);
            combination.remove(combination.size()-1);
        }

    }
}
