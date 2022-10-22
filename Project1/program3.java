import java.util.Scanner;
/**
 * Write a description of class program3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class program3
{
    public static void main(String aa[])
    {
        Scanner sc=new Scanner(System.in);
        int n, i, r ;
        System.out.println("ENTER THE NUMBER");
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            
            n=n/10;
        }
    }
}

