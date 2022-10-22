import java.util.Scanner;

/**
 * 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class program2
{
    public static void main(String aa[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n=sc.nextInt();
        int r, s=0; // i think we should initialize r1 and r2 as the values will be different in the different cases.
        while(n>0)
        {
           r=n%10;
           s=s*10+r;
           n=n/10;
        }
        n=s;
        while(n>0)
        {
            r=n%10;
            System.out.println(r);
            n=n/10;
        }
    }
}
