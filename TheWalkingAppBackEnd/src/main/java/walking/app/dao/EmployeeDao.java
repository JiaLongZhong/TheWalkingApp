package walking.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import walking.app.entities.Employee;
import walking.app.entities.Message;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer> {
	@Query(value="select * from employee where employeeid=?1", nativeQuery =true)
	public Employee findByEmployeeId(int emp);
	
	//not working in-progress
//	@Query(value="UPDATE employee SET name=?1, Salary=?2,WorkingDayPerMonth=?3 WHERE EmployeeID=?4", nativeQuery =true)
//	public Message updateEmployeeInformation(String name,double salary,int dateWorked,int eid);
//	
}
