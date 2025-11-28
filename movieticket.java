import java.util.Scanner;

/**
 * Write a description of class movieticket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class movieticket
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age group (child, adult, senior): ");
        String ageGroup = sc.next().toLowerCase();

        System.out.print("Enter movie language (nepali, hindi, english): ");
        String language = sc.next().toLowerCase();

        System.out.print("Are you a student? (yes/no): ");
        String isStudent = sc.next().toLowerCase();

        System.out.print("Is it a festival day? (yes/no): ");
        String isFestival = sc.next().toLowerCase();


        double price = 0;

        
        //  by Age Group
    
        switch (ageGroup) {
            case "child":
                price = 150;
                break;
            case "adult":
                price = 250;
                break;
            case "senior":
                price = 200;
                break;
            default:
                System.out.println("Invalid age group entered!");
                sc.close();
                return;
        }

        // by Movie Language

        switch (language) {
            case "nepali":
                break; // no surcharge
            case "hindi":
                price += 50;
                break;
            case "english":
                price += 100;
                break;
            default:
                System.out.println("Invalid movie language entered!");
                sc.close();
                return;
        }

        //. Student Discount (20%)
        
        if (isStudent.equals("yes")) {
            price -= price * 0.20;
        }

        
        // Festival Discount (15%)
        
        if (isFestival.equals("yes")) {
            price -= price * 0.15;
        }

        // Final Output
        
        System.out.println("Final Ticket Price: Rs. " + price);

      
    }
}

