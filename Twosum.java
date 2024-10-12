public class Twosum {
    public static String twoSum(int n, int []arr, int target) 
    {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[i] + arr[j] == target) 
                    return "YES";
            }
        }
        return "NO";
    }
}