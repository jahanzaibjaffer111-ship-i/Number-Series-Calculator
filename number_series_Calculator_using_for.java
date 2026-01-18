import java.util.Scanner;
public class number_series_Calculator_using_for
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner read=new Scanner(System.in);
        while(true)
        {
            System.out.println("Hello");
            System.out.println("Welcome to Number Series Calculator");
            System.out.println("Type Starting Value");
            a=read.nextInt();
            System.out.println("Type Ending Value");
            b=read.nextInt();
            System.out.println("Type Gap Value");
            c=read.nextInt();
            if (c>0)
            {
                if(a!=b)
                {
                    System.out.println("Values are");
                    if(a<b)
                    {
                        for(int i=a; i<=b; i=i+c)
                        System.out.println(i);
                    }
                    else if(a>b)
                    {
                        for(int i=a; i>=b; i=i-c)
                        System.out.println(i);
                    }
                    System.out.println("Thank you");
                    System.out.println("Bye");
                    System.out.println(".");
                }
                else if(a==b)
                {
                    System.out.println("Starting and Ending Values can't be same");
                    System.out.println("Try again");
                    System.out.println(".");
                }
            }
            else if (c==0)
            {
                 System.out.println("Gap value can't be zero");
                 System.out.println("Try again");
                 System.out.println(".");
            }
            else if (c<0)
            {
                 System.out.println("Gap value can't be negative");
                 System.out.println("Try again");
                 System.out.println(".");
            }
        }
    }

}


