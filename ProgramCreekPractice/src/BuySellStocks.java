
public class BuySellStocks {

	public static void main(String[] args) {

		int[] prices = {12,41,54,12,20};
		System.out.println(findMaxProfit(prices));
	}
	
	static int findMaxProfit(int[] prices)	{
		int profit = 0;
		for(int index=1; index< prices.length; index++)	{
			int difference = prices[index]-prices[index-1];
			if(difference>0)	{
				profit+= difference;
			}
		}
		return profit;
	}

}
