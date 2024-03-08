package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Date;
import dmacc.beans.Event;

/**  
* Ezra DeCleene - ecdecleene  
* CIS171 22149
* Mar 5, 2024  
*/
@Configuration
public class BeanConfiguration {
	@Bean
	public Event event() {
		Event bean = new Event("Event 1", "Organizer", "123 Wall St. New York, New York");
		return bean;
	}
	
	@Bean
	public Date date() {
		Date bean = new Date("01", "01", "2000");
		return bean;
	}
}
