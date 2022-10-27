package walking.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import walking.app.entities.Message;
import walking.app.entities.Product;
import walking.app.entities.Customer;
import walking.app.entities.Employee;
import walking.app.entities.Order;

@Repository
public interface CentralizedDataService{
	//product search
	public Iterable<Product> findAllProduct();
	
	// place order and payment
	public Message addOrder (Order o);
	
	//Add Product (Manager function only - in process)
	public Message addProduct(Product p);
	
	//show all product in a particular department (Manager function only - in process)
	public List<Product> findAllStockByBranch(int bid);
	
	//show customer data
	public Customer findByCustomerId(int cid);
	
	//show Employee data
	public Employee findByEmployeeId(int eid);
	
	//update Employee profile
	public Employee updateEmployeeInformation(String name,double salary,int dateWorked,int eid);
}