import java.util.Scanner;
public class table
{
    public static void main(String aa[])
    {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Which number's table do u want?");
        int n=Sc.nextInt();
        int m=1;
        for(int i=1;i<=10; i++)
        {
            m=n*i;
            System.out.println(n+"*"+i+"="+m);
        }
    }
}
