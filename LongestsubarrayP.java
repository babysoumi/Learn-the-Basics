public class LongestsubarrayP {
    public static int positive(int arr[],int k)
    {
            int n = arr.length;
            int left = 0, right = 0;
            long sum = arr[0];
            int maxLen = 0;
            while (right < n) {
                while (left <= right && sum > k) {
                    sum -= arr[left];
                    left++;
                }
                if (sum == k) {
                    maxLen = Math.max(maxLen, right - left + 1);
                }
                right++;
                if (right < n) sum += arr[right];
            }
            return maxLen;
        }
    }

