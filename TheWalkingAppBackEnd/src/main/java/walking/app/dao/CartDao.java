package walking.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import walking.app.entities.Cart;
import walking.app.entities.Customer;

@Repository
public interface CartDao extends JpaRepository<Cart,Integer> {
		
    public List<Cart> findByCustomer(Customer customer);
    
}