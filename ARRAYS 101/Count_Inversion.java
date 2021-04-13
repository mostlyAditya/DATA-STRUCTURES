package arrays;

import java.util.Scanner;

// Difficulty Level: Medium on gfg Named as Count Inversions.

//Given an array of integers. Find the Inversion Count in the array. 

//Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. 
//If array is already sorted then the inversion count is 0. If an array is sorted in the reverse order then
//the inversion count is the maximum. 
//Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.

public class Count_Inversion {
	
	static long merge (long arr[], int l, int m, int r) {
        long count = 0;
        int n1 = m + 1 - l;
        int n2 = r-m;
        long L[] = new long[n1];
        long R[] = new long[n2];
        
        for(int i =0; i<n1; i++) {
            L[i] = arr[l+i];
        }
        for(int j = 0; j<n2; j++) {
            R[j] = arr[m+1+j];
        }
        
        int i =0, j=0, k=l;
        
        while(i<n1 && j<n2) {
            if(L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                count += n1-i;
                j++;
            }
            k++;
        }
        
        while ( i<n1 ) {
            arr[k] = L[i];
            i++;
            k++;
        }
        if(i<n1) {
        count += n1-i-1;
        }
        while(j<n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        return count;
    }
    
     static long sort(long arr[], int l, int r) {
         long count1 =0, count2 =0, count3 =0;
        if(l<r) {
            int m = (l+r)/2;
             count1 = sort(arr,l,m);
             count2 = sort(arr,m+1,r);
             count3 = merge(arr,l,m,r);
        }
        return count1 + count2 + count3;
    } 
    
    static long inversionCount(long arr[], long N)
    {
        return sort(arr,0,(int)N-1);
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(inversionCount(arr, n));
            
        }
        sc.close();

	}

}
