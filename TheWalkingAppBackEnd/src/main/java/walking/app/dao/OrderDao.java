package walking.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import walking.app.entities.Order;

@Repository
public interface OrderDao extends JpaRepository<Order,Integer> {
		
	    @Query(value="select * from orders where OrderID= ?1", nativeQuery =true)
		public Order findByOrderID(int OrderID);
		
	    @Query(value="select * from orders", nativeQuery =true)
		public List<Order> findAllOrder();
	    
	    @Query(value="select * from orders where BranchID= ?1", nativeQuery =true)
		public List<Order> findAllOrderByBranchID(int BranchID);
	    
	    @Query(value="select * from orders where CustomerID= ?1", nativeQuery =true)
		public List<Order> findAllOrderByCustomerID(int CustomerID);
		
		
}
