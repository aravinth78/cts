public class PrimitiveTypes {
    public static void main(String[] args) {
        byte b = 42;
        short s = 1024;
        long l = 50000L + 10L * b + s;
        float f = 5.67f;
        char c = 'Z';

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("char: " + c);
    }
}
