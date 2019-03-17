package sbp.microservices.sbplimitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("sbp-limits-service")
public class SbpConfiguration 
{
	private int minimum;
	private int maximum;
	
	
	public void setMinimum(int minimum) 
	{
		this.minimum = minimum;
	}

	public void setMaximum(int maximum) 
	{
		this.maximum = maximum;
	}

	public int getMinimum() 
	{
		return minimum;
	}
	
	public int getMaximum() 
	{
		return maximum;
	}
	
	
}
