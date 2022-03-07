package arrays;
// Difficulty : Medium
// https://practice.geeksforgeeks.org/problems/longest-consecutive-subsequence2449

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubsequence {
	
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   Set<Integer> num = new HashSet<Integer>();
	   int maxSeq = 1, seq = 1;
	   
	   // fill the set
	   for(int e = 0; e<N; e++) {
	       num.add(arr[e]);
	   }
	   
	   for(int i = 0; i<N; i++) {
	        if(!num.contains(arr[i]-1)) { // check if array doesn't contains a number previous to current.
	           int temp = arr[i];
	           seq = 1;
	           while(num.contains(++temp)) 
	             seq++;
	       }
	       maxSeq = Math.max(maxSeq, seq);
	   }
	   return maxSeq;
	}

	public static void main(String[] args) {
		int arr[] = {1,9,3,10,4,20,2};
		System.out.println(findLongestConseqSubseq(arr,arr.length));

	}

}
