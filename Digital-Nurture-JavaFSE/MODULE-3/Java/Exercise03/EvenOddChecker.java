import java.util.Scanner;

public class ParityCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a number: ");
        int val = scan.nextInt();

        String kind = (val % 2 == 0) ? "even" : "odd";
        System.out.println(val + " is " + kind);

        scan.close();
    }
}
