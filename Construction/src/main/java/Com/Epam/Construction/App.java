package Com.Epam.Construction;

import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	Scanner cin=new Scanner(System.in);
    	System.out.print("Enter Area:");
    	float area=cin.nextFloat();
    	System.out.print("Available Material Standards:\n*Standard materials\n*High standard material\nEnter Material Standard:");
    	String material_standard=cin.next();
    	int cost;
    	if(material_standard=="standardmaterials")
    	{
    		System.out.print("Enter 1200INR if we use standard materials\n 1500INR if we use above standard materials \nEnter Auntomation:");
    		cost=cin.nextInt();
    	}
    	else
    	{
    		System.out.print("1800INR if customers needs high standard material \n2500INR if customer needs high standard material and fully automated home\nEnter Auntomation:");
            cost=cin.nextInt();
    	}
    	Calculate o=new Calculate();
    	System.out.println("Construction cost per square feet is" +o.calculating(area,cost));
    }
}
