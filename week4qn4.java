import java.util.Scanner;

/**
 * Write a description of class week4qn4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week4qn4
{
     public static void main(String[] args)
    {
       Scanner scan=new Scanner(System.in);
        System.out.println("enter your number");
      int number=scan.nextInt();
        
       
        
        if(number%3 ==0 && number%5==0)
        {
        System.out.println("the number is divisible by both");
    }
    else 
    {
        System.out.println("the number is not divisible by both");
}
}
}