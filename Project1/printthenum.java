import java.util.Scanner;
/**
 * 234=>
 * 4 -> Four
 * 3    ``
 * 2    ``
 * @author (your name)
 * @version (a version number or a date)
 */
public class printthenum
{
    public static void main(String aa[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int r;
        while(n>0)
        {
            r=n%10;
            if(r==0)
            {
               System.out.println("Zero");
            }
            else if(r==1)
            {
                System.out.println("One");
            }
            else if(r==2)
            {
                System.out.println("Two"); 
            }
            else if(r==3)
            {
                System.out.println("Three"); 
            }
            else if(r==4)
            {
                System.out.println("Four"); 
            }
            else if(r==5)
            {
                System.out.println("Five"); 
            }
            else if(r==6)
            {
                System.out.println("Six"); 
            }
            else if(r==7)
            {
                System.out.println("Seven"); 
            }
            else if(r==8)
            {
                System.out.println("Eight"); 
            }
            else if(r==9)
            {
                System.out.println("Nine"); 
            }
            n=n/10;
        }
    }
}
