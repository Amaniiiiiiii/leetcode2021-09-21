package huisu;

import java.util.ArrayList;
import java.util.List;

public class zuhe {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();

        backtrack(ans,1,k,n,combination);
        return ans;
    }

    public void backtrack(List<List<Integer>> ans,int first, int k, int n,List combination){
        if(combination.size()==k) {
            ans.add(new ArrayList<>(combination));
            return ;
        }

        for (int i = first; i <= n; i++) {
            combination.add(i);
            //下面这里要用i+1 不能用first+1
            backtrack(ans,i+1,k,n,combination);
            combination.remove(combination.size()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new zuhe().combine(5,3));
    }
}
