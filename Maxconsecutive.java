public class Maxconsecutive {
    public static int findmax(int arr[]){
        int max=0;
        int cnt=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                cnt++;
                break;
            }
            else
                cnt=0;
            max=Math.max(max, cnt);
        }
        return max;  
    }
   
}
