package walking.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import walking.app.entities.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer,Integer> {
		
}
