public class Palindrome {
    public static void main(String[] args) 
    {
        System.out.println(isPalindrome(121));
    }
   public static boolean isPalindrome(int x)
   {
        if (x < 0 || (x % 10 == 0 && x != 0)) 
        {
            return false;
        }
        int rev = 0;
        int org = x; 
        while (x > 0) 
        {
            int d = x % 10;
            rev = (rev * 10) + d;
            x /= 10;
        }
        return org== rev;
    }
}

