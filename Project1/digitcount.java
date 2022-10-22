import java.util.Scanner;
/**
 * 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class digitcount
{
    public static void main(String aa[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n=sc.nextInt();
        int r, s=0,c=0 ; 
        while(n>0)
        {
           r=n%10;
           c++;
           n=n/10;
        }
        System.out.println("Total number of digits:"+c);
    }
}
