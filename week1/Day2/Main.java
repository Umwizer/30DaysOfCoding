package week1.Day2;

public class Main {
    public static void main(String[] args) {
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
             while(true){
            System.out.print("Enter your attendance percentage: ");
            double attendance = scanner.nextDouble();

            ValidationResult result = AttencanceChecker.validateAttendance(attendance);
            if (result.isValid()) {
                AttencanceChecker checker = new AttencanceChecker(attendance);
                String eligibility = checker.checkAttendance();
                System.out.println(eligibility);
            } else {
                System.out.println("Error: " + result.getMessage());
            }

   }
        }
    }
}
