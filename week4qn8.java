import java.util.Scanner;

/**
 * Write a description of class week4qn8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week4qn8
{
    public static void main(String[] args)
    {

      Scanner input=new Scanner(System.in);
        System.out.println("enter your GPA");
       float GPA = input.nextFloat();
      
        if(GPA<0  || GPA>4)
        {
        System.out.println("not valid");
    }
    else if(GPA<4 && GPA>3.6)
    {
        System.out.println("you have scored A+ grade");
}
else if(GPA<3.6 && GPA>3.2)
    {
        System.out.println("you have scored A grade");
    }
    else if(GPA<3.2 && GPA>2.8)
    {
        System.out.println("you have scored b+ grade");
    }
    else if(GPA<2.8 && GPA>2.4)
    {
        System.out.println("you have scored b grade");
    }
    else if(GPA<2.4 && GPA>0.8)
    {
        System.out.println("you have scored c grade");
    }
   
    }
}
