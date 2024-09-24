import java.util.Scanner;

public class Fibonacci {

    public static int findNthFibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        int prev1 = 1, prev2 = 1;
        int currentFib = 0;
        for (int i = 3; i <= n; i++) {
            currentFib = prev1 + prev2;
            prev2 = prev1;
            prev1 = currentFib;
        }

        return currentFib;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findNthFibonacci(n));
        sc.close();
    }
}
