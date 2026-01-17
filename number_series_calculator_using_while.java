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
            System.out.println("Welcome to no series calc");
            System.out.println("Enter starting value");
            a=read.nextInt();
            System.out.println("Enter ending value");
            b=read.nextInt();
            System.out.println("enter gap value");
            c=read.nextInt();
            if (c>0)
            {
                if (a!=b)
                    {
                        System.out.println("value are");
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
                        System.out.println("thanks");
                        System.out.println("bye");
                        System.out.println(".");
                    }
                else if (a==b)
                {
                    System.out.println("starting and ending value cant be same");
                    System.out.println("try again");
                    System.out.println(".");
                }
            }
            else if (c<=0)
            {
                System.out.println("Gap value cant be negative or zero");
                System.out.println("try again");
                System.out.println(".");
            }
        }
    }

}
