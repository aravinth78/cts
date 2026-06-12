import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String raw = sc.nextLine();

        String clean = raw.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuilder(clean).reverse().toString();

        if (clean.equals(rev) && !clean.isEmpty())
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");

        sc.close();
    }
}
