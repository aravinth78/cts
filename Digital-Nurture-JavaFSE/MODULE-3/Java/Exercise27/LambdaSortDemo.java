import java.util.ArrayList;
import java.util.List;

public class SortWithLambda {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Chennai");
        cities.add("Mumbai");
        cities.add("Delhi");

        System.out.println("Before: " + cities);
        cities.sort((a, b) -> a.compareTo(b));
        System.out.println("After: " + cities);
    }
}
