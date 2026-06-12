public class OverloadExample {
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        System.out.println("Product of 2 ints: " + multiply(4, 5));
        System.out.println("Product of 2 doubles: " + multiply(2.5, 3.0));
        System.out.println("Product of 3 ints: " + multiply(2, 3, 4));
    }
}
