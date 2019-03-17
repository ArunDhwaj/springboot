package sbp.microservices.sbplimitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import sbp.microservices.sbplimitsservice.bean.SbpLimitsConfiguration;

@RestController
public class SbpLimitsConfigurationController 
{
	
	@Autowired
	private SbpConfiguration sbpconfiguration;
	
	@GetMapping("/sbplimits")
	public SbpLimitsConfiguration retrieveSbpLimitsConfiguration()
	{
		return new SbpLimitsConfiguration(sbpconfiguration.getMaximum(),sbpconfiguration.getMinimum());
	}
}
