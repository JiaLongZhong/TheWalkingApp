package walking.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import walking.app.entities.Message;
import walking.app.entities.Product;
import walking.app.entities.Reply;
import walking.app.entities.Customer;
import walking.app.entities.Employee;
import walking.app.entities.Feedback;
import walking.app.entities.Order;

@Repository
public interface CentralizedDataService{

//Customer Section
	//product search
	public Iterable<Product> findAllProduct();
	
	// place order and payment. Wrong need to fix
	public Message addOrder (Order o);
	
	// findOrderbyID
	public Order findByOrderID(int OrderID);
	
	//remove or cancel order
	
	//return order
	//public Message returnOrder (Order o);
	
	//feedback: add a comment
	public Message addFeedback (Feedback f);

	
//Manager Section
	//Add Product (Manager function only - in process)
	public Message addProduct(Product p);
	
	//show all product in a particular department (Manager function only - in process)
	public List<Product> findAllStockByBranch(int bid);
	
	//request Product that are out of stock 
	
	
	//show Employee data
	public Employee findByEmployeeId(int eid);
	
	//update Employee profile
//	public Message updateEmployeeInformation(String name,double salary,int dateWorked,int eid);
	
	
	//show customer data
		public Customer findByCustomerId(int cid);
		
	//create customer Profile
		public Message createCustomerProfile(Customer c);
		
	//system that calculate total price
		
	//view customer feedback by branch id
		public List<Feedback> findAllFeedbackByBranchID (int bid);
		
	// view customer by feedback id
		public Feedback findByFeedbackID(int fid);

//Owner Section	
		public List<Order> findAllOrder();
		
		public List<Order> findAllOrderByBranchID (int bid);
		
		public List<Order> findAllOrderByCustomerID (int bid);
		
		public List<Product> findAllStock();
		
		public List<Employee> findEmployeeByBranch(int bid);
		
		public Message addReplyToFeedback(Reply r);
		
		public Message updateSalary(double amt, int emp);
		
}