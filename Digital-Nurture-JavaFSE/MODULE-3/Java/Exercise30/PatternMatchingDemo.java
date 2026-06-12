public class TypeSwitch {
    public static void classify(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("Integer: " + i);
            case String s  -> System.out.println("String: \"" + s + "\"");
            case Double d  -> System.out.println("Double: " + d);
            case Boolean b -> System.out.println("Boolean: " + b);
            case null      -> System.out.println("null value");
            default        -> System.out.println("Unknown: " + obj);
        }
    }

    public static void main(String[] args) {
        classify(42);
        classify("Hello");
        classify(3.14);
        classify(false);
    }
}
