public class Arm {
    public static void main(String a[])
    {
        System.out.println(armstrong(153));
    }
    public static boolean armstrong(int x)
    {
        int s=0;
        int org=x;
        while(x>0)
        {
            int d=x%10;
            s=s+(d*d*d);
            x=x/10;
        }
        return org == s;
    }
}
