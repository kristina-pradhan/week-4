import java.util.Scanner;

/**
 * Write a description of class week4qn11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week4qn11
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your annual taxable income (NPR): ");
        double income = sc.nextDouble();

        double tax = calculateTax(income);

        System.out.println("Your total income tax is: NPR " + tax);
    }

    public static double calculateTax(double income) {

        if (income <= 500000) {
            return income * 0.01; // 1%
        }
        else if (income <= 700000) {
            return 5000 + (income - 500000) * 0.10; // 10%
        }
        else if (income <= 1000000) {
            return 15000 + (income - 700000) * 0.20; // 20%
        }
        else if (income <= 2000000) {
            return 35000 + (income - 1000000) * 0.30; // 30%
        }
        else if (income <= 5000000) {
            return 335000 + (income - 2000000) * 0.36; // 36%
        }
        else {
            return 1135000 + (income - 5000000) * 0.39; // 39%
        }
    }
}

    
