public class Reversenum {
    public static void main(String[] args) 
    {
        System.out.println(reverse(-446));
    }
    public static int reverse(int x) {
        int rev=0;
        while(x!=0)
        {
            int d=x%10;
            rev=(rev*10)+d;
            x=x/10;
        }
        return rev;
    }
    
}
