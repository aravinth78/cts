import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileSaver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter data: ");
        String data = sc.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.write(data);
            System.out.println("Written to output.txt");
        } catch (IOException e) {
            System.out.println("IO error: " + e.getMessage());
        }

        sc.close();
    }
}
