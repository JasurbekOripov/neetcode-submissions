class Solution {
    fun maxProfit(prices: IntArray): Int {
        var profit = 0
        for(i in 0 until prices.size){
            for(k in i+1 until prices.size){
                val difference = prices[k] - prices[i]
                if(difference > profit) profit = difference
            }
        }
        return profit
    }
}
