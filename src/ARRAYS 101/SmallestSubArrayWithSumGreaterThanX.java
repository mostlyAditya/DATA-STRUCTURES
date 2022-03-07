package arrays;
// Difficulty: Easy

public class SmallestSubArrayWithSumGreaterThanX {
	
	static int smallestLength(int arr[], int n, int x) {
		int start = 0, end = 0;
		int currSum = 0, minLength = n+1;
		
		while(end < n) {
			while(currSum <= x && end < n) 
				currSum += arr[end++];
			
			while(currSum > x && start < n) {
				if(minLength > end - start)
					minLength = end - start;
				currSum -= arr[start++];
			}
		}
		return minLength;
	}

	public static void main(String[] args) {
		int arr[] = {5, 45, 8, 2, 9, 0, 23};
		System.out.println(smallestLength(arr,arr.length,60));
	}

}
