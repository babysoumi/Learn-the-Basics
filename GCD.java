public class GCD {
    public static void main(String[] args) {
        System.out.println(GCDHCF(9,12));  // Output: true
    }
    public static int GCDHCF(int A,int B) {
    int gcd=1;
    for(int i=1;i<=A;i++)
    {
        if(A%i==0 && B%i==0)
            gcd=i;
    }
    return gcd;
    }
}