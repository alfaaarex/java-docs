import java.util.Scanner;
/**
 * Program allows you to get a random song recommendation for a particular artist.
 *
 * @author Agnihotra Nath
 * @version (a version number or a date)
 */
public class songrecc
{
   public static void main(String aa[])
   {
       Scanner Artist=new Scanner(System.in);
       System.out.println("Press a random number from 1 to 10");
       int e=Artist.nextInt();
       if(e==1)
       {
           System.out.println(" First Class by Jack Harlow ");
       }
       else if(e==2)
       {
           System.out.println(" bad guy by Billie Eilish ");
       }
       else if(e==3)
       {
           System.out.println(" Black Swan by BTS ");
       }
       else if(e==4)
       {
           System.out.println(" 7 Rings by Ariana Grande ");
       }
       else if(e==5)
       {
           System.out.println(" Secrets by Monsta X ");
       }
       else if(e==6)
       {
           System.out.println(" Hurricane by Kanye West ");
       }
       else if(e==7)
       {
           System.out.println(" The Motto (feat. Ava Max) by Tiesto ");
       }
       else if(e==8)
       {
           System.out.println(" Wildfire by Eric Nam ");
       }
       else if(e==9)
       {
           System.out.println( " Miracle by WayV ");
       }
       else if(e==10)
       {
           System.out.println( " Darari by Treasure ");
       }
       else
       {
           System.out.println("You have crashed the program! Restart, and next time please enter a valid option!");
       }
   }
}
import java.util.MathJax;

