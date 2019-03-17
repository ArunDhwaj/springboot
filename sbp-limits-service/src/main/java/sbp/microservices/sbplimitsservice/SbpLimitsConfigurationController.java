package sbp.microservices.sbplimitsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import sbp.microservices.sbplimitsservice.bean.SbpLimitsConfiguration;

@RestController
public class SbpLimitsConfigurationController 
{
	
	@GetMapping("/sbplimits")
	public SbpLimitsConfiguration retrieveSbpLimitsConfigurations()
	{
		return new SbpLimitsConfiguration(99,9);
	}
}
