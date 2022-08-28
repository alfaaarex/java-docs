import java.util.Scanner;
/**
 * Description: 
 *
 * @author Alfarex
 * @version 1.0.0
 */
public class hw1
{
    public static void main(String aa[])
    {
        Scanner Sc= new Scanner(System.in);
        double c, r, s, t, f, g, d;
        System.out.println("Enter no. of electricity units consumed:");
        c=Sc.nextDouble();
        r=0.5;
        if(c<=50)
        {
            g=c*0.5;
            System.out.println("Grand Total:"+" Rs. "+g);
        }
        else if(c>50 && c<=150)
        {
            g=(((50*0.5)+((c-50)*0.75)));
            System.out.println("Grand Total:"+" Rs. "+g);
        }
        else if(c>150)
        {
            g=((50*0.5)+(100*0.75)+((c-150)*1.2));
            System.out.println("Grand Total:"+" Rs. "+g);
        }
        else
        {
            System.out.println("Program crashed successfully!");
        }
    }
}
