package week1.Day1;
import java.math.BigDecimal;
public class GradeCalculator {
    double marks;
    public double  calculateGrade(double marks){
        if(marks>=90){
            return 'A';
        } else if (marks>=80) {
            return 'B';
        } else if (marks>=70) {
            return 'C';
        } else if (marks>=60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    public boolean validation (double marks){
        if(marks<0 || marks>100){
            return false;
        }
        BigDecimal bd = new BigDecimal(Double.toString(marks));
        return bd.scale()<=2;
    }
}
