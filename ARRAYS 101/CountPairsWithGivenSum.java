package arrays;
/*  Difficulty : Easy 
 *  https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022
 */


import java.util.HashMap;

public class CountPairsWithGivenSum {
	
	public static int countPairs(int arr[], int n, int k) {
		int noOfPairs = 0;
		HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
		
		for(int i = 0; i<n; i++) {
			if(mp.containsKey(k - arr[i]))
				noOfPairs += mp.get(k - arr[i]);
			mp.put(arr[i], mp.get(arr[i])==null ? 1 : mp.get(arr[i]) + 1);
		}
		
		return noOfPairs;
	}

	public static void main(String[] args) throws Exception {
		
		int arr[] = {1, 5, 7, 1};
		int n = 4, k = 6;
		
	            int ans = countPairs(arr, n, k);
	            System.out.println(ans);
	        }

	}


