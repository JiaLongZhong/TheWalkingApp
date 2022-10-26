package walking.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import walking.app.entities.Product;


@Repository
public interface ProductDao extends JpaRepository<Product,Integer> {
		
}