import java.util.*;
/**
 * write a series based on s=n+(n-1)+.....+1
 *
 * @author agnihotra
 * @version 0.0.1
 */
public class series1
{
    public static void main(String aa[])
    {
        Scanner Sc=new Scanner(System.in);
        int s=0;
        System.out.println("Enter no. of terms for the series:");
        int n=Sc.nextInt();
        for(int i=n;i>=1; i--)
        {
            s=s+i;
        }
        System.out.println("The series sum is:"+s);
    }
}
