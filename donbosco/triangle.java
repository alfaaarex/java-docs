import java.util.Scanner;
/**
 * Write a description of class triangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class triangle
{
   public static void main(String aa[])
   {
       Scanner Ang=new Scanner(System.in);
       System.out.println("Please enter the first angle");
       int a=Ang.nextInt();
       System.out.println("Please enter the second angle");
       int b=Ang.nextInt();
       System.out.println("Please enter the third angle");
       int c=Ang.nextInt();
       
       if((a+b+c)==180)
       {
           System.out.println("Yes, this triangle is possible to plot!");       
       }
       else
       {
           System.out.println("No, this is an invalid triangle.");
       }
       
}
}
