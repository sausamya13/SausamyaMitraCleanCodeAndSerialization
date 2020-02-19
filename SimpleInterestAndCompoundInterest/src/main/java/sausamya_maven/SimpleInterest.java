package sausamya_maven;

public class SimpleInterest extends getData
{
	double simpleinterest;
	public SimpleInterest(double principal,double interestrate,double timeinyears)
	{
		super(principal,interestrate,timeinyears);
		
	}
    public double CalculateSimpleInterest()
    {
    	simpleinterest=(principal*interestrate*timeinyears)/100;
    	return simpleinterest;
    }
}
