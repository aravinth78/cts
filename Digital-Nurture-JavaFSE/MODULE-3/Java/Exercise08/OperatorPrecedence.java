public class OrderOfOps {
    public static void main(String[] args) {
        int x = 6 + 4 * 2;
        System.out.println("6 + 4 * 2 = " + x);

        int y = (6 + 4) * 2;
        System.out.println("(6 + 4) * 2 = " + y);

        int z = 24 / 3 - 2;
        System.out.println("24 / 3 - 2 = " + z);

        int w = 17 % 5 + 3;
        System.out.println("17 % 5 + 3 = " + w);
    }
}
