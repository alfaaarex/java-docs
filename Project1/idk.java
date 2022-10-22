import java.util.Scanner;
/**
 * Write a description of class idk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class idk
{
    public static void main(String aa[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Starting number:");
        int a=sc.nextInt();
        System.out.println("Up till:");
        int n=sc.nextInt();
        for(; a<=n; a++)
        {
            if(a%2!=0)
            {
               System.out.println(a); 
            }
        }
    }
}
