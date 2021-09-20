package tanxin;

public class jiayouzhan {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int length = gas.length;

        for (int i = 0; i < length; i++) {
            int myGas = 0;
            int temp = i;
            for (int j = 0; j < length; j++) {//控制次数的循环
                myGas+=gas[temp];
                myGas-=cost[temp];
                temp = (temp+1)%length;
                if(myGas<0) break;
            }
            if(myGas>=0) return temp ;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new jiayouzhan().canCompleteCircuit(new int[]{5,1,2,3,4},new int[]{4,4,1,5,1}));
    }
}
