package jianzhiOffer;

public class erweishuzuzhongdechazhap {
    public static void main(String[] args) {
        int[][] nums = new int[][] {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(new erweishuzuzhongdechazhap().Find(7,nums));
    }

    public boolean Find(int target, int [][] array) {
        int n = array.length;
        int m = array[0].length;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                if(array[i][j]==target) return true;
            }
        }
        return false;
    }

}
