package sbp.microservices.sbpcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SbpCloudConfigServerApplication
{

	public static void main(String[] args) 
	{
		SpringApplication.run(SbpCloudConfigServerApplication.class, args);
	}

}
