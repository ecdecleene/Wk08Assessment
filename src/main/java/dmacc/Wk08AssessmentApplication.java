package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Date;
import dmacc.beans.Event;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.EventRepository;

@SpringBootApplication
public class Wk08AssessmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(Wk08AssessmentApplication.class, args);
	}

	@Autowired
	EventRepository repo;
	
	public void run(String... args) throws Exception{
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Event e = appContext.getBean("event", Event.class);
		e.setOrganizer("Organizer");
		repo.save(e);
		Event f = new Event("Event 2", "Organizer 2", "Location TBD");
		Date d = new Date("02", "02", "2002");
		f.setDate(d);
		repo.save(f);
		List<Event> allEvents = repo.findAll();
		for(Event events: allEvents) {
			System.out.println(events.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}
}
