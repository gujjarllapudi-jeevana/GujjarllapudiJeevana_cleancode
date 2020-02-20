package Com.Epam.Clientside;

import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	Scanner cin=new Scanner(System.in);
        System.out.print( "The principal investment amount:" );
        float principal_amount=cin.nextFloat();
        System.out.print( "The time the money is invested or borrowed for:" );
        int time=cin.nextInt();
        System.out.print( "The annual interest rate" );
        int rate=cin.nextInt();
        Simple o1=new Simple();
        System.out.print("Simple Interset is:"+o1.simple_interset(principal_amount, time, rate));
        Compound o2=new Compound();
        System.out.print("If yearly enter 12 \n Quaterly enter 4");
        System.out.println("The number of times that interest is compounded per unit t\n");
        int n=cin.nextInt();
        System.out.println("Compound Interset is:"+o2.compound_interest(principal_amount, time, rate,n));

    }
    
}
