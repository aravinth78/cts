import java.util.HashMap;
import java.util.Scanner;

public class ScoreMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> scores = new HashMap<>();

        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter score: ");
        int score = sc.nextInt();

        scores.put(name, score);

        System.out.print("Search for: ");
        sc.nextLine();
        String key = sc.nextLine();

        if (scores.containsKey(key))
            System.out.println("Score: " + scores.get(key));
        else
            System.out.println("Not found");

        sc.close();
    }
}
