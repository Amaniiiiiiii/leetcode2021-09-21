import java.util.Scanner;

public class baidu1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int[] data = new int[number];

        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            data[i] = Integer.parseInt(str.substring(i,i+1));
        }

        int[] min = new int[1];
        min[0] = data.length-1;
        backstrack(data,0,0,min);
        System.out.println(min[0]);
    }

    // 5 21202 输出的应该是1 但是是3
    public static void backstrack(int[] data,int index,int time,int[] min){
        if(index==data.length-1){
            min[0] = Math.min(min[0],time);
            return ;
        }
        backstrack(data,index+1,time+1,min);
        for (int i = index+1; i < data.length; i++) {
            if(data[i]==data[index]){
                backstrack(data,i,time+1,min);
            }
        }
    }
}
