public class CastPlay {
    public static void main(String[] args) {
        double price = 199.99;
        int rounded = (int) price;
        System.out.println("Original double: " + price);
        System.out.println("After narrowing to int: " + rounded);

        int quantity = 7;
        double total = quantity * 1.5;
        System.out.println("Widening int to double: " + total);
    }
}
