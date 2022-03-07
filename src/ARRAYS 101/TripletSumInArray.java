package arrays;

import java.util.Arrays;

public class TripletSumInArray {
	
	public static boolean find3Numbers(int A[], int n, int X) { 
		   
	    Arrays.sort(A);
	       
	       for(int k = 0; k<n; k++) {
	           int i = k+1;
	           int j = n-1;
	           while(i<j ) {
	               int sum = A[i] + A[j] + A[k];
	               if(X == sum)
	                  return true;
	               else if(X > sum)
	                  i++;
	               else 
	                  j--;
	           }
	       }
	       return false;
	    
	    }

	public static void main(String[] args) {
		int arr[] = {1,4, 45, 6, 10, 8};
		System.out.println(find3Numbers(arr,arr.length,13));

	}

}
