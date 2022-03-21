package arrays;
// Difficulty: Medium

public class MInSwapsAndKTogether {
	
	public static int minSwaps(int arr[], int n, int k) {
		int count= 0, bad = 0;
		for(int i = 0; i<n; i++) {
			if(arr[i] <= k) count++;
		}
		
		for(int j = 0; j<count; j++) {
			if(arr[j] > k) bad++;
		}
		
		int ans = bad;
		for(int i = 0, j = count; j<n; i++,j++) {
			if(arr[i] > k) bad--;
			if(arr[j] > k) bad++;
			
			ans = Math.min(ans, bad);
		}
		return ans;
	}

	public static void main(String[] args) {
		int arr[] = {2, 1, 5, 6, 3};
	    int n = arr.length;
	    int k = 3;
	    System.out.print(minSwaps(arr, n, k) + "\n");
	  
	    int arr1[] = {2, 7, 9, 5, 8, 7, 4};
	    n = arr1.length;
	    k = 5;
	    System.out.print(minSwaps(arr1, n, k));

	}

}
