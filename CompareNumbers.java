public class CompareNumbers {

    public static String compareNM(int n, int m) {
        if (n < m) {
            return "lesser";
        } else if (n == m) {
            return "equal";
        } else {
            return "greater";
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(compareNM(4, 8));  // Output: lesser
        System.out.println(compareNM(8, 8));  // Output: equal
        System.out.println(compareNM(10, 8)); // Output: greater
    }
}
