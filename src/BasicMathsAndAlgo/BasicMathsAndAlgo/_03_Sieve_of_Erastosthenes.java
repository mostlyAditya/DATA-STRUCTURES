package BasicMathsAndAlgo.BasicMathsAndAlgo;

import java.util.Arrays;
import java.util.Scanner;

/*
  1. declare boolean array and mark all of them true;
  2. use two for loops
     a.outer one checks for a prime number.
     b.inner loop marks all the multiples of that prime false
  3. print all the numbers
 */

// Time Complexity : O(nloglogn) and Space Complexity : O(n)
public class _03_Sieve_of_Erastosthenes {

    public static void findAllPrime(int n) {
        boolean nums[] = new boolean[n+1];
        Arrays.fill(nums, true);

        // finding all primes
        for(int i = 2; i*i <= n; i++) {
            if(nums[i] == true) {
                for(int j = i*i; j <= n; j += i) {
                    nums[j] = false;
                }
            }
        }

        // printing all primes
        for(int i = 2; i < nums.length; i++) {
            if(nums[i] == true) {
                System.out.print(i+ " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        findAllPrime(n);


    }
}
