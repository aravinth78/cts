import java.util.ArrayList;
import java.util.Scanner;

public class NameCollector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many items? ");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<String> items = new ArrayList<>();
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++)
            items.add(sc.nextLine());

        System.out.println("List:");
        for (String s : items)
            System.out.println("- " + s);

        sc.close();
    }
}
