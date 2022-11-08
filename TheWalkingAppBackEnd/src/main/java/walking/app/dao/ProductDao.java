package walking.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import walking.app.entities.Product;


@Repository
public interface ProductDao extends JpaRepository<Product,Integer> {
	
	@Query(value="select * from product", nativeQuery =true)
	public List<Product> findAllStock();
	
	@Query(value="select * from product where branchid=?1", nativeQuery =true)
	public List<Product> findAllStockByBranch(Integer bid);
}