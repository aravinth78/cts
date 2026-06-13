interface Shape {
    void render();
}

class Round implements Shape {
    public void render() {
        System.out.println("Drawing a Circle...");
    }
}

public class ShapeInterface {
    public static void main(String[] args) {
        Round r = new Round();
        r.render();
    }
}
