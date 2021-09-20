package hot100new;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class no39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        LinkedList<Integer> combination = new LinkedList<>();

        backtrack(list,candidates,target,0,combination);
        return list;
    }

    public void backtrack(List<List<Integer>> list, int[] candidates,int target,int index,LinkedList<Integer> combination){
        if(index == candidates.length) return ;
        if(target == 0 ) {
            list.add(new ArrayList<>(combination));
            return;
        }

        backtrack(list,candidates,target,index+1,combination);

        if(target-candidates[index]>=0){
            combination.add(candidates[index]);
            backtrack(list,candidates,target-candidates[index],index+1,combination);
            combination.remove(combination.size()-1);
        }

    }
}
