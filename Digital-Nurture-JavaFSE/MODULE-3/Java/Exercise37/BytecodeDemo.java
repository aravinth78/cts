public class MathOperation {
    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        MathOperation demo = new MathOperation();
        int diff = demo.subtract(30, 12);
        System.out.println("30 - 12 = " + diff);
        System.out.println("Run: javap -c MathOperation");
    }
}
