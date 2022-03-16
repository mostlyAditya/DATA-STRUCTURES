package Backtracking;
// Josephus Problem :

public class _02_Josephus_Problem {

    public static int solution(int n, int k) {
         if(n == 1) return 0;

         int x = solution(n-1, k);
         int y = (x + k) % n;
         return y;
    }

    public static void main(String[] args) {

    }

}
