package walking.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import walking.app.entities.Employee;
import walking.app.entities.Product;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer> {
	
	@Query(value="select * from employee", nativeQuery =true)
	public List<Product> findAllEmployee();
	
	@Query(value="select * from employee where employeeid=?1", nativeQuery =true)
	public Employee findByEmployeeId(int emp);
	
	@Query(value="select * from employee where branchid=?1", nativeQuery =true)
	public List<Employee> findEmployeeByBranch(int bid);

}
