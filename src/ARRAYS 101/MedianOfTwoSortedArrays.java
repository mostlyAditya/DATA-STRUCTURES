package arrays;
// Difficulty: Hard (very good problem)
// time complexity : O(log(min(x,y)))

public class MedianOfTwoSortedArrays {
	
     static public double medianOfArrays(int a[], int b[]) {
		if(a.length > b.length) {
			return medianOfArrays(b,a);
		}
		
		int x = a.length;
		int y = b.length;
		
		int low = 0;
		int high = x;
		
		while(low <= high) {
			int partitionX = (low + high)/2;
			int partitionY = (x+y+1)/2 - partitionX;
			
			int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : partitionX;
			int minRightX = (partitionX == x) ? Integer.MAX_VALUE : partitionX;
			
			int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : partitionY;
			int minRightY = (partitionY == y) ? Integer.MAX_VALUE : partitionY;
			
			if(maxLeftX <= minRightY && maxLeftY <= minRightX) {
				
				if((x+y)%2 == 0) {
					return ((double) (Math.max(maxLeftX,maxLeftY) + Math.min(minRightX, minRightY)))/2.0;
				}
				else {
					return (double) Math.max(maxLeftY, maxLeftX);
				}			
			}
			else if (maxLeftX > minRightY) {
				// we are too far on right side so we need to move left in array a(which is smaller).
				high = partitionX - 1;
			}
			else {
				// we are too far on left side so we need to move right in array a(which is smaller).
				low = partitionX + 1;
			}
		}
		return 0.0;
	}

	public static void main(String[] args) {
		int a[] = {-5, 3, 6, 12, 15};
		int b[] = {-12, -10, -6, -3, 4, 10};
		
		System.out.println(medianOfArrays(a,b));

	}

}
