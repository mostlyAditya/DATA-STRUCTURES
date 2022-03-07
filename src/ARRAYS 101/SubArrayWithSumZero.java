package arrays;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithSumZero {
	
	static boolean findZeroSumSubArray(int arr[], int n) {
		Set<Integer> ps = new HashSet<Integer>();
		int sum = 0;
		for(int i = 0; i< n; i++) {
			sum += arr[i];
			if(sum == 0|| arr[i] == 0 || ps.contains(sum))
				return true;
			ps.add(sum);
		}
		return false;
	}

	public static void main(String[] args) {
	   int arr[] = {1,2,3,4,5};
	   int arr2[] = {10,-10};
	   System.out.println(findZeroSumSubArray(arr,arr.length));
	   System.out.println(findZeroSumSubArray(arr2,arr2.length));

	}

}
