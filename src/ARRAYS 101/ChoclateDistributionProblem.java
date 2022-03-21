package arrays;
// Chocolate Distribution Problem

import java.util.Arrays;

public class ChoclateDistributionProblem {
	
	static int findMinDiff(int arr[], int n, int m) {
		Arrays.sort(arr);
		int minDiff = Integer.MAX_VALUE;
		int i = 0;
		
		while(i+m-1<n) {
			minDiff = Math.min(minDiff ,Math.abs(arr[i+m-1] - arr[i]));
		    i++;
		}
		return minDiff;
	}

	public static void main(String[] args) {
		int arr[] = {7, 8, 10, 4 ,3, 25, 78, 1, 2};
		System.out.println(findMinDiff(arr,arr.length,5));

	}

}
