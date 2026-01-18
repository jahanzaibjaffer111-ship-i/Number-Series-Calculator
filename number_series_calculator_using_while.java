import java.util.Scanner;
public class number_series_calculator_using_while
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner read=new Scanner(System.in);
        while(true)
        {
            System.out.println("Hello");
            System.out.println("Welcome to Number Series Calculator");
            System.out.println("Enter Starting Value");
            a=read.nextInt();
            System.out.println("Enter Ending Value");
            b=read.nextInt();
            System.out.println("Enter Gap Value");
            c=read.nextInt();
            if (c>0)
            {
                if (a!=b)
                    {
                        System.out.println("Values are");
                        if(a<b)
                            {
                                while (a<=b)
                                    {
                                        System.out.println(a);
                                        a=a+c;
                                    }

                            }
                        else if(a>b)
                            {
                                while (a>=b)
                                    {
                                        System.out.println(a);
                                        a=a-c;
                                    }
                            }
                        System.out.println("Thank you");
                        System.out.println("Bye");
                        System.out.println(".");
                    }
                else if (a==b)
                {
                    System.out.println("Starting and Ending Value cant be same");
                    System.out.println("Try again");
                    System.out.println(".");
                }
            }
            else if (c=0)
            {
                System.out.println("Gap Value can't be zero");
                System.out.println("Try again");
                System.out.println(".");
            }
            else if (c<0)
            {
                System.out.println("Gap Value can't be negative");
                System.out.println("Try again");
                System.out.println(".");
            }
        }
    }

}

