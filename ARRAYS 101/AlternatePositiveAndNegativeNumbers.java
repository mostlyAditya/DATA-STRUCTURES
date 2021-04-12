package arrays;
/* Difficulty: Easy on gfg.
 * https://practice.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AlternatePositiveAndNegativeNumbers {
	
	void rearrange(int arr[], int n) {

        ArrayList<Integer> neg = new ArrayList<Integer>();
        ArrayList<Integer> pos = new ArrayList<Integer>();
        
        for (int i = 0; i < n; i++) {

            if (arr[i] < 0)
                neg.add(arr[i]);
            else
                pos.add(arr[i]);
        }

        int i = 0, j = 0, k = 0;
        
        // if array starts with positive elements.
        if(arr[0] >= 0) {
        while (i < neg.size() && j < pos.size()) {
            arr[k++] = pos.get(j++);
            arr[k++] = neg.get(i++);
        }
        while (j < pos.size()) { arr[k++] = pos.get(j++); }

        while (i < neg.size()) { arr[k++] = neg.get(i++); }
        }
        // if array starts with negative element.
        else {
        	 while (i < neg.size() && j < pos.size()) {
                 arr[k++] = neg.get(i++);
                 arr[k++] = pos.get(j++);
             }
             while (j < pos.size()) { arr[k++] = pos.get(j++); }

             while (i < neg.size()) { arr[k++] = neg.get(i++); }
        }
    }

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new AlternatePositiveAndNegativeNumbers().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

	}

}
