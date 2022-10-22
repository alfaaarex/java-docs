import java.util.Scanner;
/**
 * WAP to input a number and check whether the number is a Krishnamurthy number or not.
 * (a number is said to be a krishnamurthy number if the sum of the factorials of its digits is equal to the 
 * number itself.)
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class knumber
{
    public static void main(String aa[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int sum=0, fact=1, r;
        int original=n;
        while(n>0)
        {
            r=n%10;
            for(int i=1; i<=r; i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            fact=1; // Factorial value is refreshed to 1 because it is involved in multiplication for factorial.
            n=n/10;
        }
        if(original==sum)
        {
            System.out.println("The entered number is a Krishnamurthy number.");
        }
        else
        {
            System.out.println("The entered number is not a Krishnamurthy number.");
        }
    }
}
