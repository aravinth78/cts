import java.util.Scanner;

public class ReverseText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        char[] chars = input.toCharArray();
        String rev = "";
        for (int i = chars.length - 1; i >= 0; i--)
            rev += chars[i];

        System.out.println("Reversed: " + rev);
        sc.close();
    }
}
