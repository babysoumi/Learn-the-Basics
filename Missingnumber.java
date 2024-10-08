public class Missingnumber {
    public static int sum(int arr[],int n,int sum)
    {
        sum=n*(n+1)/2;
        int s2=0;
        for(int i=1;i<n-1;i++)
        {
            s2+=arr[i];
        }
        return (sum-s2);
    }
}
