import java.util.Scanner;

public class YearValidator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = s.nextInt();

        boolean leap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        if (leap)
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");

        s.close();
    }
}
