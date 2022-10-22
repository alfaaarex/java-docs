
/**
 * Write a description of class seriesprogram here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class seriesprogram
{
    public static void main(String aa[])
    {
        double sum=0;
        double s=1;
        double pro=1;
        for(int i=2; i<=4; i++)
        {
            s=s+i; // if s=1, then s+2 =1+2; which satisfies our requirements.
            pro=pro*i;
            sum+=s/pro;
        }
        System.out.println("Sum of series:"+sum);
    }
}
