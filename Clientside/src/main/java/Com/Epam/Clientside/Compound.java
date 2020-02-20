package Com.Epam.Clientside;

import java.math.*;
class Compound
{
	public double compound_interest(float p,int t,int r,int n)
	{
		double po=Math.pow((1+r*t), (n*t));
		return(p*po-p);
	}
}
