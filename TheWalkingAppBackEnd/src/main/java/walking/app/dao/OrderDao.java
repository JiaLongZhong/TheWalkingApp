package walking.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import walking.app.entities.Order;

@Repository
public interface OrderDao extends JpaRepository<Order,Integer> {
		
}
