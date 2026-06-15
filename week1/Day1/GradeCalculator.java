package week1.Day1;
import java.math.BigDecimal;
public class GradeCalculator {
    double marks;
    public String  calculateGrade(double marks){
        if(marks>=90){
            return "A";
        } else if (marks>=80) {
            return "B";
        } else if (marks>=70) {
            return "C";
        } else if (marks>=60) {
            return "D";
        } else {
            return "F";
        }
    }
    public static ValidationResult validateScore(double marks) {
    
    if (marks < 0) {
        return new ValidationResult(false, "Score cannot be negative. Please enter a value between 0 and 100.");
    }
    
    if (marks > 100) {
        return new ValidationResult(false, "Score cannot exceed 100. Please enter a value between 0 and 100.");
    }
    
    BigDecimal bd = new BigDecimal(Double.toString(marks));
    if (bd.scale() > 2) {
        return new ValidationResult(false, "Score cannot have more than 2 decimal places. Example: 84.5 is valid, 84.555 is not.");
    }
    
    return new ValidationResult(true, "Valid score.");
}
}
