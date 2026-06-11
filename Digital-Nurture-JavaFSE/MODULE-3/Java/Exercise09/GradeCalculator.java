import java.util.Scanner;

public class ScoreEvaluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score: ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid score");
        } else {
            char grade;
            if (marks >= 85) grade = 'A';
            else if (marks >= 70) grade = 'B';
            else if (marks >= 55) grade = 'C';
            else if (marks >= 40) grade = 'D';
            else grade = 'F';
            System.out.println("Grade: " + grade);
        }

        sc.close();
    }
}
