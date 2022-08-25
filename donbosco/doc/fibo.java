import java.util.Scanner;
public class fibo
{
    public static void main(String aa[])
    {
         Scanner Sc= new Scanner(System.in);
         int f, s, t, n, i;
         System.out.println("Enter number of terms:");
         n=Sc.nextInt();
         f=0;
         s=1;
         t=0;
         for(i=3; i<=n; i++)
         {
             t=f+s;
             System.out.print(" "+t);
             f=s;
             s=t;
         }
    }
}
