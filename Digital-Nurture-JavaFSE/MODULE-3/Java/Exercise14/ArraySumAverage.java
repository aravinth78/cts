import java.util.Scanner;

public class NumberStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int count = sc.nextInt();

        int[] values = new int[count];
        int total = 0;

        System.out.println("Enter " + count + " values:");
        for (int i = 0; i < count; i++) {
            values[i] = sc.nextInt();
            total += values[i];
        }

        double avg = (double) total / count;
        System.out.println("Sum = " + total);
        System.out.println("Average = " + avg);

        sc.close();
    }
}
