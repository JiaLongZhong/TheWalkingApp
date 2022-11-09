package walking.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import walking.app.entities.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer> {
	@Query(value="select * from employee where employeeid=?1", nativeQuery =true)
	public Employee findByEmployeeId(int emp);
	
	//not working in-progress
	//@Query(value="UPDATE employee SET name=?1,Salary=?2, WorkingDayPerMonth=?3 WHERE EmployeeID=?4", nativeQuery =true)
	//public Employee updateEmployeeInformation(String name,double salary,int dateWorked,int eid);
	
	@Query(value="select * from employee where branchid=?1", nativeQuery =true)
	public List<Employee> findEmployeeByBranch(int bid);
	
	//@Query(value="UPDATE employee SET Salary = Salary + ?1 where EmployeeID=?2", nativeQuery =true)
	//public Employee updateSalary(double amt, int emp);
}
