package arrays;
// Difficulty: Medium

public class TrappingRainWater {
	
	static int trappingWater(int arr[], int n) {
		
		int left = 0, right = n-1;
		int leftmax = 0, rightmax = 0;
		int res = 0;
		
		while(left <= right) {
			if(arr[left] <= arr[right]) {
				if(arr[left] >= leftmax)
					leftmax = arr[left];
				else
					res += leftmax - arr[left];
			}
			else {
				if(arr[right] >= rightmax)
					rightmax = arr[right];
				else
					res += rightmax - arr[right];
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		int water[] = {5, 0, 8, 9, 1, 0};
		System.out.println(trappingWater(water, water.length));

	}

}
