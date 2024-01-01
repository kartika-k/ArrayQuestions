public class buyAndSellStock{
    public static int buyAndSellStocks(int prices[]){
        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for(int i=0; i<prices.length; i++){
            if(buy_price < prices[i]){//profit
               int profit = prices[i] - buy_price;  //today's or current profit
               max_profit = Math.max(max_profit,profit);
            }
            else{
                buy_price = prices[i];
            }
        }
        return max_profit;
    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buyAndSellStocks(prices));
    }
}