import java.util.Scanner;

/**
 * Write a description of class week4qn9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week4qn9
{
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter GPA: ");
        double gpa = scanner.nextDouble();

        System.out.print("Enter attendance percentage: ");
        double attendance = scanner.nextDouble();

        System.out.print("Enter attitude score (1–10): ");
        int attitude = scanner.nextInt();

        // Nested if checks
        if (gpa >= 3.2) {
            if (attendance > 80) {
                if (attitude < 5) {
                    System.out.println("Student is eligible for a scholarship.");
                } else {
                    System.out.println("Not eligible: Attitude score is too high.");
                }
            } else {
                System.out.println("Not eligible: Attendance is too low.");
            }
        } else {
            System.out.println("Not eligible: GPA is too low.");
        }

        
    }
}

