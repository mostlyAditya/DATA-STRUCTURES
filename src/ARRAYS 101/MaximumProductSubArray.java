package arrays;

public class MaximumProductSubArray {
	
	static long maxProduct(int[] arr, int n) {
        long maxP = arr[0], posP = arr[0], negP = arr[0];
        int count = 0;
        
        for(int i = 0; i < n; i++) {
            if(arr[i] > 0) {
                posP *= arr[i];
                negP = Math.min(negP*arr[i],1);
            }
            else if(arr[i] == 0) {
                posP = negP = 1;
                count++;
                if(count == n) 
                  return 0;
            }
            else {
                long temp = posP;
                posP = Math.max(negP*arr[i],1);
                negP = temp*arr[i];
            }
            if(maxP<posP) {
                maxP = posP;
            }
        }
        return maxP;
    }

	public static void main(String[] args) {
		int arr[] = {4, -3, 7, 9, 0};
		System.out.println(maxProduct(arr,arr.length));

	}

}
