package hot100;

import java.util.HashMap;

public class maigupiao {
    public int maxProfit(int[] prices) {
        int maxprice = 0;
        int minprice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<minprice)
                minprice = prices[i];
            else if(maxprice<prices[i]-minprice)
                maxprice = prices[i] - minprice;
        }
        return maxprice;
    }
}
