import java.util.Scanner;
/**
 * Convert fahrenheit to celsius.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ftwoc
{
    public static void main(String aa[])
    {
        Scanner Temp=new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit Scale");
        int f=Temp.nextInt();
        float c=((f-32)*5)/9;
        System.out.println("Temperature in Celsius Scale:"+c);
        if(c<=10)
        {
            System.out.println("Hey! Looks like it's Cold.");
        }
        else if(c>=30)
        {
            System.out.println("Hey! Looks like it's Hot.");
        }
        else
        {
            System.out.println("Hey! Looks like it's Moderate.");
        }
    }
}
