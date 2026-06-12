import java.util.Scanner;

public class FibSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Positive integer required");
        } else {
            System.out.println("Fibonacci at " + n + " = " + fib(n));
        }

        sc.close();
    }

    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
