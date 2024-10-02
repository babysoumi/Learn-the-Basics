import java.util.ArrayList;

public class Mergesort {
    public static void mergesort(int arr[], int l,int h)
    {
        while (l<h) {
            int mid=(l+h)/2;
            mergesort(arr, l, mid);
            mergesort(arr, mid+1,h);
            merge(arr,l,mid,h);
            
        }
    }
    public static void merge(int arr[], int l,int mid,int h)
    {
        ArrayList<Integer> temp= new ArrayList<>();
        int left=l;
        int right=h;
        while (left<=mid && right<=h) {
            if(arr[left]<=arr[right])
            {
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while (left<=mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right<=h) {
            temp.add(arr[right]);
            right++;
        }
        for(int i=l;i<=h;i++)
        {
            arr[i]=temp.get(arr[i-l]);
        }
    }
}