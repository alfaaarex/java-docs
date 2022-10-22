import java.util.Scanner;
public class AvgOfOdd
{
    public static void main(String aa[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,sum=0,c=0;
        float avg;
        System.out.println("Enter 10 numbers:");
        for(i=1; i<=10; i++)
        {
            n=sc.nextInt();
            if(n%2!=0)
            {
                sum=sum+n;
                c++;
            }
        }
        avg=sum/c;
        System.out.println("Average of odd numbers:"+avg);
    }
}