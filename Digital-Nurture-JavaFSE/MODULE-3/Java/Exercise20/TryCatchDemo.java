import java.util.Scanner;

public class DivisionSafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numerator: ");
        int num = sc.nextInt();
        System.out.print("Denominator: ");
        int den = sc.nextInt();

        try {
            int res = num / den;
            System.out.println("Result = " + res);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        sc.close();
    }
}
