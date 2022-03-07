package arrays;
// Difficulty: Medium
// https://www.geeksforgeeks.org/maximum-profit-by-buying-and-selling-a-share-at-most-twice/

public class MaxProfitBuyingAndSellingStocksAtMostTwice {

	// Dynamic Programming Approach difficult to imagine.
	static int maxProfit(int price[], int n) {
		int profit[] = new int[n];
		for(int i = 0; i<n; i++)
			profit[i] = 0;
		
		// Traversing the array right to left and counting the max profit in one transaction.
		int max_price = price[n-1];
		for(int i =n-2; i>=0; i--) {
			
			if(price[i] > max_price) 
				max_price = price[i];
			
			profit[i] = Math.max(profit[i+1], max_price - price[i]);
		}
		
		// Traversing the array from left to right and counting the max profit in two transactions.
		int min_price = price[0];
		for(int i = 1; i<n; i++) {
			
			if(min_price > price[i])
				min_price = price[i];
			
			profit[i] = Math.max(profit[i-1], profit[i] + price[i] - min_price);
		}
		// return the last element which contains the max profit.
		return profit[n-1];
	}
	
	public static void main(String[] args) {
		int price[] = {10, 22, 5, 75, 65, 80};
		System.out.println(maxProfit(price,price.length));

	}

}
