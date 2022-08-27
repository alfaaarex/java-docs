import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class AltHome {
    public static void main(String aa[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = sc.nextLine();
        System.out.println("Hello" + " " + name + "!");
        System.out.println("Please select a program:");
        System.out.println("To use TempCalc, press 1");
        System.out.println("To use SongRec, press 2");
        System.out.println("To try FibNumbers, press 3");
        System.out.println("To try TriangleCheck, press 4");
        System.out.println("To use SeriesCreate, press 5");
        System.out.println(" ");
        System.out.println("Your choice:");
        int choice = sc.nextInt();
        if (choice == 1) {
            Scanner Temp = new Scanner(System.in);
            System.out.println("Enter temperature in Fahrenheit Scale");
            int f = Temp.nextInt();
            float c = ((f - 32) * 5) / 9;
            System.out.println("Temperature in Celsius Scale:" + c);
            if (c <= 10) {
                System.out.println("Hey! Looks like it's Cold.");
            } else if (c >= 30) {
                System.out.println("Hey! Looks like it's Hot.");
            } else {
                System.out.println("Hey! Looks like it's Moderate.");
                return;

            }


        } else if (choice == 2) {
            Scanner Artist = new Scanner(System.in);
            System.out.println("Press a random number from 1 to 10");
            int e = Artist.nextInt();
            if (e == 1) {
                System.out.println(" First Class by Jack Harlow ");
            } else if (e == 2) {
                System.out.println(" bad guy by Billie Eilish ");
            } else if (e == 3) {
                System.out.println(" Black Swan by BTS ");
            } else if (e == 4) {
                System.out.println(" 7 Rings by Ariana Grande ");
            } else if (e == 5) {
                System.out.println(" Secrets by Monsta X ");
            } else if (e == 6) {
                System.out.println(" Hurricane by Kanye West ");
            } else if (e == 7) {
                System.out.println(" The Motto (feat. Ava Max) by Tiesto ");
            } else if (e == 8) {
                System.out.println(" Wildfire by Eric Nam ");
            } else if (e == 9) {
                System.out.println(" Miracle by WayV ");
            } else if (e == 10) {
                System.out.println(" Darari by Treasure ");
            } else {
                System.out.println("You have crashed the program! Restart, and next time please enter a valid option!");
            }
        } else if (choice == 3) {
            Scanner Sc = new Scanner(System.in);
            System.out.println("Input number of terms:");
            int n = Sc.nextInt();
            int f = 0;
            int s = 1;
            int t = 0;
            System.out.println(f + " " + s);
            for (int i = 3; 1 <= n; i++) {
                t = f + s;
                System.out.print(" " + t);
                f = s;
                s = t;

            }
        } else {
            System.out.println("Whoops! Did not work. Restart the app.");
        }
    }
}
