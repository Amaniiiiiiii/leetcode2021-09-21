package dongtai;

public class ali1 {
    public int findKthPositive(int[] arr, int k) {
        int count = 0;
        int j = 0;
        for (int i = 1; i <= arr.length + k; i++) {
            if( j<arr.length && arr[j]==i ) j++;
            else count++;
            if(count==k) {
                return i;
            }
        }
        return 0;
    }
}
