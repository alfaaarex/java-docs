
/**
 * marks of 3 subjects, if avg is greater than 90 print excellent or print 'good try'.
 *
 * @author Agnihotra
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class work1
{
    public static void main(String aa[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String n=Sc.nextLine();
        System.out.println("Enter marks of Subject 1:");
        int a=Sc.nextInt();
        System.out.println("Enter marks of Subject 2:");
        int b=Sc.nextInt();
        System.out.println("Enter marks of Subject 3:");
        int c=Sc.nextInt();
        float s=(a+b+c)/3;
        if(s>=90)
        {
            System.out.println("Excellent Marks.");
        }
        else
        {
            System.out.println("Heh. Good try.");
        }
    }
}
