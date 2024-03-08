package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Event;

/**  
* Ezra DeCleene - ecdecleene  
* CIS171 22149
* Mar 5, 2024  
*/
@Repository
public interface EventRepository extends JpaRepository<Event, Long>{

}
