package week1.Day2;

public class AttencanceChecker {
    private double attendance;
    
    public AttencanceChecker(double attendance) {
        this.attendance = attendance;
    }
    public String checkAttendance() {
        if (attendance >= 75) {
            return "Eligible for Exam";
        } else {
            return "Not Eligible for Exam";
        }
    }
    public static ValidationResult validateAttendance(double attendance) {
        if (attendance < 0) {
            return new ValidationResult(false, "Attendance cannot be negative. Please enter a value between 0 and 100.");
        }
        
        if (attendance > 100) {
            return new ValidationResult(false, "Attendance cannot exceed 100. Please enter a value between 0 and 100.");
        }
        
        return new ValidationResult(true, "Valid attendance.");
    }
}
