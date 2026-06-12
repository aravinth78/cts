public class Vehicle {
    String branch;
    String variant;
    int yr;

    void displayInfo() {
        System.out.println("Make: " + branch);
        System.out.println("Model: " + variant);
        System.out.println("Year: " + yr);
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.branch = "Honda";
        v.variant = "Civic";
        v.yr = 2023;
        v.displayInfo();
    }
}
