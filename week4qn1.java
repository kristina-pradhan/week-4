import java.util.Scanner;

/**
 * Write a description of class week4qn1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week4qn1
{
    public static void main(String[] args)
    {
       Scanner scan=new Scanner(System.in);
        System.out.println("enter your marks");
      int marks=scan.nextInt();
        
       
        
        if(marks>=40)
        {
        System.out.println("you  have passed your exam");
    }
    else
    {
        System.out.println("you have failed your exam");
}
}
}