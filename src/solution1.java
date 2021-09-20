
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class solution1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int peopleNumber = in.nextInt();
            int realationNumber = in.nextInt();
            HashMap<Integer,Integer> telephone = new HashMap<>();
            for (int i = 0; i < realationNumber; i++) {

                telephone.put(in.nextInt(),in.nextInt());
            }
            int searchNumber = in.nextInt();
            int[][] searchInfo = new int[searchNumber][2];
            for (int i = 0; i < searchInfo.length; i++) {
                searchInfo[i][0] = in.nextInt();
                searchInfo[i][1] = in.nextInt();
            }
            ArrayList<Integer> ans = new ArrayList<>();
            ans = call(peopleNumber,realationNumber,telephone,searchNumber,searchInfo);
            System.out.println(ans.get(0));
            System.out.println(ans.get(1));
        }
    }

    public static ArrayList<Integer> call(int peopoleNumber, int realationNumber, HashMap<Integer,Integer> telephone, int searchNumber, int [][] searchInfo){
        ArrayList<Integer> ans = new ArrayList<>();
        int a = 0,b=0;
        //a找b
        for (int i = 0; i  < searchInfo.length; i++) {
            a = searchInfo[i][0];
            b = searchInfo[i][1];

            ans.add(oneCall(peopoleNumber,realationNumber,telephone,a,b));
        }
        return ans;
    }

    public static int oneCall(int peopoleNumber, int realationNumber, HashMap<Integer,Integer> telephone,int caller,int answer){
        if(caller>peopoleNumber || answer>peopoleNumber) return -1;
        int count=0;

        while(caller!=answer){

            if(telephone.containsKey(caller)){
                caller = telephone.get(caller);
                count++;
            }else break;
        }

        return count==0?-1:count;
    }


}
