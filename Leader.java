public class Leader {
    public static ArrayList<Integer> printleaders(int[] arr, int n)
    {
        ArrayList<Integer> ans= new ArrayList<>();
        int maxi =0;
        for (int i = n - 1; i >= 0; i--)
        {
            if (arr[i] > maxi) 
            {
                ans.add(arr[i]);
                maxi = arr[i];
            }
        }
        return ans; 
    }
}
