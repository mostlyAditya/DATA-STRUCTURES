package arrays;

public class ThreeWayPartitioning {
	

    
    public static void threeWayPartition(int array[], int a, int b)
    {
        int start = 0, mid = 0, end = array.length - 1;
        
        while(mid<=end ) {
            if (array[mid] < a) {
                int temp = array[mid];
                array[mid] = array[start];
                array[start] = temp;
                start++;
                mid++;
            }
            else if (array[mid] >= a && array[mid] <= b ){
               mid++;
            }
            else {
                int temp = array[mid];
                array[mid] = array[end];
                array[end] = temp;
                end--;
            }
               
        }
    }

	public static void main(String[] args) {
		
		int arr[] = {68, 43, 16, 90};
		threeWayPartition(arr,36,60);
		for(int e : arr) {
			System.out.print(e + " ");
		}

	}

}
