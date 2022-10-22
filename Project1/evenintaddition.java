import java.util.Scanner;
public class evenintaddition
{
    public static void main(String aa[])
    {
        Scanner sc=new Scanner(System.in);
        int n=0, i=0, sum=0;
        System.out.println("Enter a series of numbers of your choice. (Press zero to stop):");
        do
        {
            n=sc.nextInt();
            if(n%2==0)
            {
                sum=sum+n;
            }
        }
        while(n!=0);
        System.out.println(sum);
    }
}