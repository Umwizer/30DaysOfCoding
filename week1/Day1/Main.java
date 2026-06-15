package week1.Day1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeCalculator gradeCalculator = new GradeCalculator();

        while (true) {
            System.out.print("Enter your marks (or -1 to exit): ");
            double marks = scanner.nextDouble();

            if (marks == -1) {
                System.out.println("Goodbye!");
                break;
            }

            ValidationResult result = GradeCalculator.validateScore(marks);

            if (result.isValid()) {
                String grade = (String) gradeCalculator.calculateGrade(marks);
                System.out.println("Your grade is: " + grade);
            } else {
                System.out.println("Error: " + result.getMessage());
            }

            System.out.println();
        }

        scanner.close();
    }
}