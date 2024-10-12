public class Rearrangealternate {
    public static ArrayList<Integer> RearrangebySign(ArrayList<Integer> A) {
        int n = A.size();
        ArrayList<Integer> ans = new ArrayList<>(n);
        for (int i = 0; i < n; i++)
        {
            ans.add(0);
        }
        int posIndex = 0, negIndex = 1;
        for (int i = 0; i < n; i++) 
        {
            if (A.get(i) < 0) {
                ans.set(negIndex, A.get(i));
                negIndex += 2;
            }
            else {
                ans.set(posIndex, A.get(i));
                posIndex += 2;
            }
        }
        return ans;
    }
}