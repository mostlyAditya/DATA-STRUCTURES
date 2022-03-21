package BasicMathsAndAlgo.BasicMathsAndAlgo;

import java.util.Scanner;
// HCF and GCD are same.
// LCM*HCF = a*b.

public class _02GCD {

    public int findGCD(int a, int b) {
        // to understand this use division technique and apply it and you will see commonality in them.
        return a == 0 ? b : findGCD( b % a , a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        _02GCD c = new _02GCD();
        System.out.println(c.findGCD(a,b));

    }

    }
