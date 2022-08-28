import java.util.Scanner;
/**
 * WAP to input two numbers.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class iff
{
    public static void main(String aa[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the 1st number.");
        int a=Sc.nextInt();
        //System.out.println("1st number"+a);
        System.out.println("Enter the 2nd number");
        int b=Sc.nextInt();
        if(a>b)
            {
                System.out.println(" the bigger number is"+a);
            }
            
            else
            {
                System.out.println(" the bigger number is"+b);
            }
            
    }
}
