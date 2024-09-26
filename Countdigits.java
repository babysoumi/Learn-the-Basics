public class Countdigits {
    public static void main(String[] args) 
    {
        System.out.println(countDivisibleDigits(2446)); // Output: 1
    }

    public static int countDivisibleDigits(int N) {
        int orgnum = N;
        int count = 0;
        while (N > 0) {
            int digit = N % 10; // remainder
            N /= 10;            // Remove the last digit
            if (digit != 0 && orgnum % digit == 0) {
                count++;
            }
        }

        return count;
    }
}
