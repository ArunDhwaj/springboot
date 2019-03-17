package sbp.microservices.sbplimitsservice.bean;

public class SbpLimitsConfiguration 
{
	private int maximum;
	private int minimum;
	
	protected SbpLimitsConfiguration()
	{
		
	}
	
	public int getMaximum() 
	{
		return maximum;
	}
	
	public int getMinimum() 
	{
		return minimum;
	}

	public SbpLimitsConfiguration(int maximum, int minimum) 
	{
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	
	
	
	
}
