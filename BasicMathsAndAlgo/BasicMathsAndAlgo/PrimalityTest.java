package BasicMathsAndAlgo;

import java.util.*;

public class PrimalityTest {

    // function to calculate prime number.
    public static boolean isPrime(int n) {
        // base case
        if(n <= 1) return false;

        for(int i = 2; i*i <= n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check if it is prime or not : ");
        int n = sc.nextInt();
        System.out.println(isPrime(n));

        sc.close();
    }

}
