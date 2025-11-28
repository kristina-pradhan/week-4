import java.util.Scanner;

/**
 * Write a description of class week4qn6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week4qn6
{
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float mp, sp, discount = 0;
        char category;

        System.out.print("Enter the marked price of the item: ");
        mp = input.nextFloat();

       
        System.out.print("Enter the category of the item ");
           
        category = input.next().charAt(0);

        // Determine discount based on category
        if (category == 'A') {
            discount = 0.60f;  // 60%
        } else if (category == 'B' ) {
            discount = 0.40f;  // 40%
        } else if (category == 'C' ) {
            discount = 0.20f;  // 20%
        } else if (category == 'D' ) {
            discount = 0.10f;  // 10%
        }
        else {
            System.out.println("Invalid category!");
            
        }

        sp = mp - (mp * discount);

    
        System.out.println("Selling Price = " + sp);
    }
}

