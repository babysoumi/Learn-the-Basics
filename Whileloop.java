import java.util.Scanner;

public class Whileloop {

    public static void printReverseTable(int n) {
        int i = 10;
        while (i > 0) {
            System.out.print(n * i);
            if (i > 1) {
                System.out.print(" ");
            }
            i--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printReverseTable(n);
        sc.close();
    }
}
