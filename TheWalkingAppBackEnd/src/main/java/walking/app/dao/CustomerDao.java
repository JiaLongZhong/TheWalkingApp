package walking.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import walking.app.entities.Customer;
import walking.app.entities.Product;

@Repository
public interface CustomerDao extends JpaRepository<Customer,Integer> {
	@Query(value="select * from customer where customerid=?1", nativeQuery =true)
	public Customer findByCustomerId(int cid);

}
