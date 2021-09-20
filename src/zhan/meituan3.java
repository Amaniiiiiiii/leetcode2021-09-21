package zhan;

import java.util.*;

public class meituan3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n = in.nextInt();
            int m = in.nextInt();
         //}
        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(data));
        for (int i = 0; i < n-m+1; i++) {
            System.out.println(Search(i,data,m));
        }
    }

    public static int Search(int number,int[] data,int m){
        //第一个数据开始的索引 从0开始
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            if(map.containsKey(data[number+i])){
                map.put(data[number+i],map.get(data[number+i])+1);
            }else map.put(data[number+i],1);
        }

        Collection<Integer> collection = map.values();
        Object[] object = collection.toArray();
        Arrays.sort(object);

        return (Integer)object[object.length-1];
    }


}
