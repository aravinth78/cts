import java.util.Scanner;

public class FactorialFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial undefined for negatives");
        } else {
            long fact = 1;
            int i = 1;
            while (i <= n) {
                fact *= i;
                i++;
            }
            System.out.println(n + "! = " + fact);
        }

        sc.close();
    }
}
