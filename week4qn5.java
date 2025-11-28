import java.util.Scanner;

/**
 * Write a description of class week4qn5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week4qn5
{public static void main(String[] args)
    {

      Scanner scan=new Scanner(System.in);
        System.out.println("enter your number");
      int number=scan.nextInt();
        if(number>=0)
        {
        System.out.println("the number is positive");
    }
    else if(number==0)
    {
        System.out.println("the number is zero");
}
else
{
     System.out.println("the number is negative");
}
    
}
}
    
