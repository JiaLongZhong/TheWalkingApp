package walking.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import walking.app.entities.Employee;
import walking.app.entities.Order;

@Repository
public interface OrderDao extends JpaRepository<Order,Integer> {
		@Query(value="select * from orders where OrderID= ?1", nativeQuery =true)
		public Order findByOrderID(int OrderID);
			
		@Query(value="UPDATE orders SET feedback= '?1' , WHERE OrderID=?2", nativeQuery =true)
		public Order updateOrde(String name,double salary,int dateWorked,int eid);
				
	
}
