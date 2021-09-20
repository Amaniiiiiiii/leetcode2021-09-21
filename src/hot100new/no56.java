package hot100new;

import java.util.ArrayList;
import java.util.List;

public class no56 {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        int length = intervals.length;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if((intervals[i][0]<intervals[j][0]&&intervals[i][1]<intervals[j][0]) || (intervals[i][1]>intervals[j][1]&&intervals[i][0]>intervals[j][1])){
                    //不可以合并

                }
            }
        }
        return null;
    }
}
