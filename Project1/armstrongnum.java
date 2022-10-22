import java.util.Scanner;
/**
 * WAP to input a number and check whether the number is a armstrong number or not.
 * (a number is said to be a Armstrong number if the sum of the cube of its digits is equal to the 
 * number itself.)
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class armstrongnum
{
    public static void main(String aa[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int r, sum=0;
        int original=n;
        while(n>0)
        {
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(sum==original)
        {
            System.out.println("The number is an Armstrong number.");
        }
        else
        {
            System.out.println("The number is not an Armstrong number.");
        }
    }
}
