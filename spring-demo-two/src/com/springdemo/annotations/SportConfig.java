package com.springdemo.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
//@ComponentScan("com.springdemo.annotations")
public class SportConfig {
	//define bean for sad fortune service
	@Bean
	public FortuneService sadFortuneService()
	{
		return new sadFortuneService();
	}
	
	//define bean for swim coach and inject dependencies
   @Bean
   public Coach swimCoach()
   {
	   return new SwimCoach(sadFortuneService());
   }
   
}
