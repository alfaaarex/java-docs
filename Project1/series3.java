import java.util.Scanner;
/**
 * s= 5/4 + 5/3 + 5/2 + 5/1. This is needed to be done using for loop.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class series3
{
    public static void main(String aa[])
    {
        Scanner sc=new Scanner(System.in);
        int d=4;
        double s=1;
        for(;d>=1;d--)
        {
            s=s+5/d;
        }
        System.out.println("s="+s);
    }
}
