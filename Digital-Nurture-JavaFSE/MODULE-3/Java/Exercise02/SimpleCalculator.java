import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter value for x: ");
        double x = in.nextDouble();
        System.out.print("Enter value for y: ");
        double y = in.nextDouble();

        System.out.println("\nChoose operation:");
        System.out.println("1 -> Add");
        System.out.println("2 -> Subtract");
        System.out.println("3 -> Multiply");
        System.out.println("4 -> Divide");
        System.out.print("Your choice: ");
        int option = in.nextInt();

        switch (option) {
            case 1 -> System.out.println("Sum = " + (x + y));
            case 2 -> System.out.println("Difference = " + (x - y));
            case 3 -> System.out.println("Product = " + (x * y));
            case 4 -> {
                if (y != 0)
                    System.out.println("Quotient = " + (x / y));
                else
                    System.out.println("Cannot divide by zero");
            }
            default -> System.out.println("Invalid option");
        }

        in.close();
    }
}
