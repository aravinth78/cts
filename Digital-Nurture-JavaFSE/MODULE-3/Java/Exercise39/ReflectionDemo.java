import java.lang.reflect.Method;

class MathBox {
    public void add() {
        System.out.println("Addition operation");
    }
    public void subtract() {
        System.out.println("Subtraction operation");
    }
}

public class ReflectPlay {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("MathBox");
            System.out.println("Loaded class: " + cls.getName());

            Method[] methods = cls.getDeclaredMethods();
            System.out.println("Methods:");
            for (Method m : methods)
                System.out.println("  " + m.getName());

            Object instance = cls.getDeclaredConstructor().newInstance();
            cls.getMethod("add").invoke(instance);

        } catch (Exception e) {
            System.out.println("Reflection error: " + e.getMessage());
        }
    }
}
