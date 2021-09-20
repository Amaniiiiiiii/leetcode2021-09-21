package huisu;

import java.util.*;

public class quanpailie {
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        LinkedList<Integer> output = new LinkedList<>();

        backtrack(res,output,0,nums);

        removeSame(res);
        return res;
    }

    public void backtrack(List<List<Integer>> res,LinkedList<Integer> output, int index,int[] nums){
        if(index==nums.length) {
            //加一个去重 会栈溢出
            res.add(new ArrayList<>(output));
        }
        else {
            //全部的遍历
            for (int i = 0; i < nums.length; i++) {
                output.add(nums[i]);
                backtrack(res,output,index+1,nums);
                output.removeLast();
            }
        }
    }

    public boolean haveSame(List<Integer> list){
        //这个可行
        LinkedHashSet<Integer> list1 = new LinkedHashSet<>(list);
        if(list1.size()==list.size()) return false;
        else return true;
        /**
            List<Integer> list1 = list;
            Iterator<Integer> it = list1.iterator();
            int temp = 0;
            while(it.hasNext()){
                temp = it.next();
                list1.remove(temp);
                if(list1.contains(temp)) return true;
            }
            return false;
         **/
    }

    public void removeSame(List<List<Integer>> list){
        Iterator<List<Integer>> it = list.iterator();
        while(it.hasNext()){
            List<Integer> temp  =  new ArrayList<>(it.next());
            LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(temp);
            //把list里的换掉
        }
    }

    //用交换来遍历
    public void backtrack1(List<List<Integer>> res,LinkedList<Integer> output, int index,int[] nums){
        if(index==nums.length) {
            //下面如果不new arraylist的话 里面的output会一直变化，我们需要的是暂时的值
            res.add(new ArrayList<>(output));
        }
        else {
            for (int i = index; i < nums.length; i++) {
                Collections.swap(output,index,i);
                backtrack1(res,output,index+1,nums);
                Collections.swap(output,index,i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new quanpailie().permute(new int[]{1,2,3}));

        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 2,  3,  4, 5, 6,  7, 8));
        System.out.println(new quanpailie().haveSame(numbersList));
    }
}
