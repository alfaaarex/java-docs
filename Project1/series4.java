import java.util.Scanner;
/**
 * 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class series4
{
    public static void main(String aa[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entee value for n:");
        double n=sc.nextDouble();
        double s=0.0;
        for(int i=1;i<=5;i++)
        {
            double m=n+1;
            s=s+(n/m);
            n=n-1;
            m=m+2;
        }
        System.out.println("Value of loop is:"+s);
    }
}
