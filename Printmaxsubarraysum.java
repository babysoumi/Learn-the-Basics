public class Printmaxsubarraysum {
    public static long maxsubarraySum(int[] arr, int n) {
        long maxi = Long.MIN_VALUE;
        long sum = 0;
        int start = 0;
        int astart = -1, aend = -1;
        for (int i = 0; i < n; i++) 
        {
            if (sum == 0) start = i;
            sum += arr[i];
            if (sum > maxi) 
            {
                
                maxi = sum;
                astart = start;
                aend = i;
            }
            if (sum < 0) 
            {
                sum = 0;
            }
        }
        return maxi;
    }
}
