import java.util.Scanner;

/**
 * Write a description of class week4qn2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week4qn2
{
    public static void main(String[] args)
    {
       Scanner scan=new Scanner(System.in);
        System.out.println("enter your number");
      int number=scan.nextInt();
        
       
        
        if(number%2 ==0)
        {
        System.out.println("the number is even");
    }
    else
    {
        System.out.println("the number is odd");
}
}
}