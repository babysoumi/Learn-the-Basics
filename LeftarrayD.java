public class LeftarrayD {
    public static void Rotate(int[] arr, int n, int d) {
        d = d % n;
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            arr[i] = temp[i];
          }
        for (int i = d; i < n; i++) {
            arr[i- d] = arr[i];
          }
        for (int i = n - d; i < n; i++) {
            arr[i]=temp[i - (n-d)] ;
        }
        
      }
}
