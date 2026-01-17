import java.util.Scanner;
public class number_series_Calculator_using_for
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner read=new Scanner(System.in);
        while(true)
        {
            System.out.println("hello");
            System.out.println("welcome to no series calc");
            System.out.println("type starting value");
            a=read.nextInt();
            System.out.println("type ending value");
            b=read.nextInt();
            System.out.println("type gap value");
            c=read.nextInt();
            if (c>0)
            {
                if(a!=b)
                {
                    System.out.println("values are");
                    if(a<b)
                    {
                        for(int i=a; i<=b; i=i+c)
                        System.out.println(i);
                    }
                    if(a>b)
                    {
                        for(int i=a; i>=b; i=i-c)
                        System.out.println(i);
                    }
                    System.out.println("Thanks");
                    System.out.println("bye");
                    System.out.println(".");
                }
                else if(a==b)
                {
                    System.out.println("starting and ending values cant be same");
                    System.out.println("try again");
                    System.out.println(".");
                }
            }
            else if (c<=0)
            {
                 System.out.println("Gap cant be negative or zero");
                 System.out.println("try again");
                 System.out.println(".");
            }
        }
    }
}