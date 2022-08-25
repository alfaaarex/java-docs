import java.util.Scanner;
/**
 * s=1-2+3-4+5
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class series2
{
    public static void main(String aa[])
    {
        Scanner Sc=new Scanner(System.in);
        int s=0;
        int n=1;
        for(int i=1; i<=5; i++)
        {
         if(i%2==0)
         {
             s=s-i;
         }
         else
         {
            s=s+i; 
         }
        }
        System.out.println("sum of series is:"+s);
    }
}
