import java.util.Scanner;

/**
 * Write a description of class week4qn3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week4qn3
{public static void main(String[] args)
    {

      Scanner scan=new Scanner(System.in);
        System.out.println("enter your number");
      int number=scan.nextInt();
        if(number%3==0)
        {
            if (number%5==0)
            {
                  System.out.println("the number is divisible by 3 and 5 both");
                
            }
            else {
                
                 System.out.println("the number is divisible by 3 but not by 5");
            }
        
    }
    else if (number%5==0)
    {
        System.out.println("the number is divisible by 5 and not 3 ");
    }
    else {
        System.out.println("the number is not divisible by 5 and not by 3 ");
        
    }
}
}
    
    

