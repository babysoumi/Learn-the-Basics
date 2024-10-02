public class Removeduplicate {
    public static int remove(int arr[],int n) {
        int i=0;
        for(int j=1;j<=n;j++)
        {
            if(arr[i]!=arr[j])
            {
                arr[j]=arr[i+1];
                i++;
            }
        }
        return arr[i+1];
        
    }
    
}