import java.util.Scanner;
/**
 * Write a description of class fibo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class fibon
{
    public static void main(String aa[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Input number of terms:");
        int n=Sc.nextInt();
        int f=0;
        int s=1;
        int t=0;
        System.out.println(f+" "+s);
        for(int i=3;1<=n; i++)
        {
            t=f+s;
                System.out.print(" "+t);
                f=s;
                s=t;
                
        }
    }
}
