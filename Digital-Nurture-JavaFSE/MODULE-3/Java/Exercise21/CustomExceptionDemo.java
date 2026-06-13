import java.util.Scanner;

class UnderAgeException extends Exception {
    public UnderAgeException(String msg) {
        super(msg);
    }
}

public class AgeValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            validateAge(age);
            System.out.println("Access granted");
        } catch (UnderAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }

    static void validateAge(int age) throws UnderAgeException {
        if (age < 18)
            throw new UnderAgeException("Must be 18 or older");
    }
}
