import java.util.Scanner;
/**
 * 
 * - Menu driven program.
 * - Merges Class "knumber' and Class "armstrongnum".
 * - case 1: WAP to input a number and check whether the number is a armstrong number or not.
 *           (a number is said to be a Armstrong number if the sum of the cube of its digits is equal to the 
 *           number itself.)
 * - case 2: WAP to input a number and check whether the number is a Krishnamurthy number or not.
 *           (a number is said to be a krishnamurthy number if the sum of the factorials of its digits is equal to the 
 *           number itself.)
 * @author (your name)
 * @version (a version number or a date)
 */
public class MergedProgram1
{
    public static void main(String aa[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to number identifier menu!");
        System.out.println("PRESS 1 TO USE ARMSTRONG NUMBER CHECKER.");
        System.out.println("PRESS 2 TO USE KRISHNAMURTHY NUMBER CHECKER.");
        System.out.println("Your choice:");
        int sw=sc.nextInt();
        switch(sw)
        {
            case 1: System.out.println("Enter a number:");
                int n1=sc.nextInt();
                int r1, sum1=0;
                int original1=n1;
                while(n1>0)
                {
                    r1=n1%10;
                    sum1=sum1+(r1*r1*r1);
                    n1=n1/10;
                }
                if(sum1==original1)
                {
                    System.out.println("The number is an Armstrong number.");
                }
                else
                {
                    System.out.println("The number is not an Armstrong number.");
                }
                break;

            case 2: System.out.println("Enter a number:");
                int n2=sc.nextInt();
                int sum2=0, fact=1, r2;
                int original2=n2;
                while(n2>0)
                {
                    r2=n2%10;
                    for(int i=1; i<=r2; i++)
                    {
                        fact=fact*i;
                    }
                    sum2=sum2+fact;
                    fact=1; // Factorial value is refreshed to 1 because it is involved in multiplication for factorial.
                    n2=n2/10;
                }
                if(original2==sum2)
                {
                    System.out.println("The entered number is a Krishnamurthy number.");
                }
                else
                {
                    System.out.println("The entered number is not a Krishnamurthy number.");
                }
                break;
                
            default: System.out.println("Invalid option!!");
        }
    }
}

