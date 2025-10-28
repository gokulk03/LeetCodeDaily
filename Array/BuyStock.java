package Array;


public class BuyStock{

    public int maxProfit(int[] prices) {
        int maximumProfit = 0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                maximumProfit = Math.max(maximumProfit, prices[j]-prices[i]);
            }
        }
        return maximumProfit;
    } 

    public int maxProfitOptimized(int[] prices){
        int buyPrice = prices[0];
        int currentProfit = 0;
        int maxiProfit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buyPrice){
                buyPrice = prices[i];
            }else{
                currentProfit = prices[i]-buyPrice;
                maxiProfit = Math.max(maxiProfit, currentProfit);
            }
        }
        return maxiProfit;
    }

    public static void main(String[] args) {
        BuyStock buyStock = new BuyStock();
        int[] prices = {5,1,5,6,7,1,10};
        System.out.println("Answer : "+buyStock.maxProfitOptimized(prices));
    }
}

