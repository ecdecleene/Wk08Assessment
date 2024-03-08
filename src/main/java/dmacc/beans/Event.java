package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**  
* Ezra DeCleene - ecdecleene  
* CIS171 22149
* Mar 5, 2024  
*/
@Entity
public class Event {
	@Id
	@GeneratedValue
	private int id;
	private String eventName;
	private String organizer;
	private String location;
	@Autowired
	private Date date;
	
	/**
	 * @param eventName
	 */
	public Event(String eventName) {
		super();
		this.eventName = eventName;
	}
	/**
	 * 
	 */
	public Event() {
		super();
	}
	/**
	 * @param id
	 * @param eventName
	 * @param organizer
	 * @param location
	 */
	public Event(int id, String eventName, String organizer, String location) {
		super();
		this.id = id;
		this.eventName = eventName;
		this.organizer = organizer;
		this.location = location;
	}
	/**
	 * @param eventName
	 * @param organizer
	 * @param location
	 */
	public Event(String eventName, String organizer, String location) {
		super();
		this.eventName = eventName;
		this.organizer = organizer;
		this.location = location;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}
	/**
	 * @param eventName the eventName to set
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	/**
	 * @return the organizer
	 */
	public String getOrganizer() {
		return organizer;
	}
	/**
	 * @param organizer the organizer to set
	 */
	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "[ID: " + id + ", Event Name: " + eventName + ", Organizer: " + organizer + ", Location: " + location + ", Date: " + date + "]";
	}
}
