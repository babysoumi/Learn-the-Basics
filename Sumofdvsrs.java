public class Sumofdvsrs {
    public static void main(String[] args) {
        System.out.println(sumOfDivisors(4)); 
    }

    public static int sumOfDivisors(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) 
            sum = sum+(i * (N / i));
              
        return sum;
    }
}
