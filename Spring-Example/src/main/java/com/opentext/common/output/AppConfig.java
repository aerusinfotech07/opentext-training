package com.opentext.common.output;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(name = "newOutputHelper")
	public OutputHelper getOutputHelper()
	{
		OutputHelper outputHelper=new OutputHelper(new JsonOutputGenerator());
		return outputHelper;
		
	}
	
	
}
