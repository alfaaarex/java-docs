import java.util.*;
public class calculate
{
    public static void main(String aa[])
    {
        Scanner sc=new Scanner(System.in);
        int sw;
        double last=0;
        System.out.println("##############################################");
        System.out.println("");
        System.out.println("################# Calculator #################");
        System.out.println("");
        System.out.println("##############################################");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("1.   Addition Engine "); // Addition
        System.out.println("2.   Subtraction Engine "); // Subtraction
        System.out.println("3.   Multiplication Engine "); // Multiply
        System.out.println("4.   Division Engine "); // Divide
        System.out.println(" ");
        System.out.println("5.   Print last result ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Enter your choice:");
        sw=sc.nextInt();
        switch(sw)
        {
            case 1:double a1, a2, a3, a4, a5, sum;
                   System.out.println("Enter the numbers one by one, max. 5 numbers. \n Fill the remaining with 0.");
                   a1=sc.nextDouble();
                   a2=sc.nextDouble();
                   a3=sc.nextDouble();
                   a4=sc.nextDouble();
                   a5=sc.nextDouble();
                   sum=a1+a2+a3+a4+a5;
                   last=sum;
                   System.out.println("Sum:"+sum);
                   break;
            
            case 2: double s1, s2, s3, diff;
                    System.out.println("Enter the numbers one by one IN ORDER, max. 3. \n Fill the remaining with 0.");
                    s1=sc.nextDouble();
                    s2=sc.nextDouble();
                    s3=sc.nextDouble();
                    diff=s1-s2-s3;
                    System.out.println("Difference:"+diff);
                    last=diff;
                    break;
                    
            case 3: double m1, m2, m3, m4, m5, product;
                    System.out.println("Enter the numbers one by one IN ORDER, max. 5. \n Fill the remaining with 1.");
                    m1=sc.nextDouble();
                    m2=sc.nextDouble();
                    m3=sc.nextDouble();
                    m4=sc.nextDouble();
                    m5=sc.nextDouble();
                    product=m1*m2*m3*m4*m5;
                    System.out.println("Product:"+product);
                    last=product;
                    break;
                    
            case 4: double d1, d2, quo, rem;
                    System.out.println("Enter the dividend and then divisor.");
                    d1=sc.nextDouble();
                    d2=sc.nextDouble();
                    quo=d1/d2;
                    rem=d1%d2;
                    System.out.println("Quotient:"+quo);
                    System.out.println("Remainder:"+rem);
                    last=quo;
                    break;
                    
            case 5: System.out.println("Last result:"+last);
                    break;
                    
            default: System.out.println("Incorrect parameters.");
        }
    }
}