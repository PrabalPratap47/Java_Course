
public static int BuyAndSellStocks(int prices[]){
    int buyPrice = Integer.MAX_VALUE;   //+infity
    int maxProfit = 0;


    for(int i =0;i<prices.length;i++){
        if(buyPrice < prices[i]){ //profit
            int profit = prices[i]-buyPrice; //Today's Profit

            maxProfit = Math.max(maxProfit,profit); //overall max profit
        }

        else{                       //if  buy price is more we assign current price means prices to it .
            buyPrice=prices[i];   
        }
    }
    return maxProfit;

}
public static void main(String[] args) {
    int prices[]={7,1,5,3,6,4};
    System.out.println(BuyAndSellStocks(prices));
}
}