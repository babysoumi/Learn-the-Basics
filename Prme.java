public class Prme {
    public static void main(String[] args) 
    {
        System.out.println(checkprme(7));
    }
    public static boolean checkprme(int x)
    {
        if (x <= 1) {
            return false;
        }
        
        // Check for factors from 2 to the square root of x
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false; // x has a divisor other than 1 and itself
            }
        }
        
        // If no factors found, x is prime
        return true;
    }
}