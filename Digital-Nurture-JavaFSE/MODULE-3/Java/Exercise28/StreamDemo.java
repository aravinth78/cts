import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStream {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(11);
        nums.add(22);
        nums.add(33);
        nums.add(44);

        List<Integer> filtered = nums.stream()
                .filter(n -> n > 20)
                .collect(Collectors.toList());

        System.out.println("Original: " + nums);
        System.out.println("Filtered (>20): " + filtered);
    }
}
