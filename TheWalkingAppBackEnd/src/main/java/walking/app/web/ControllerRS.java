package walking.app.web;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import walking.app.entities.Customer;
import walking.app.entities.Employee;
import walking.app.entities.Feedback;
import walking.app.entities.Message;
import walking.app.entities.Order;
import walking.app.entities.Product;
import walking.app.entities.Reply;
import walking.app.service.CentralizedDataService;

@RestController @RequestMapping ("/TheWalkingApp")
@CrossOrigin(origins="http://localhost:4200",maxAge=3600, allowCredentials="true")
public class ControllerRS{
	@Autowired
	private CentralizedDataService service;
	
	@GetMapping("/product")
	public Iterable<Product> findAllProduct(){
		return service.findAllProduct();
	}
	
	@PostMapping("/orders")
	public Message addOrder(@RequestBody Order o) {
		return service.addOrder(o);
	}
	@GetMapping("/orders/{id}")
	public Order findByOrderID(@PathVariable int id) {
		return service.findByOrderID(id);
	}
	@PostMapping("/product")
	public Message addProduct(@RequestBody Product p) {
		return service.addProduct(p);
	}
	
	@GetMapping("/products-branch/{bid}")
	public List<Product> findAllStockByBranch(@PathVariable int bid){
		return service.findAllStockByBranch(bid);
	}
	
	@GetMapping("/customer/{id}")
	public Customer findByCustomerId(@PathVariable int id) {
		return service.findByCustomerId(id);
	}
	
	@PostMapping("/customer")
	public Message createCustomerProfile(@RequestBody Customer c) {
		return service.createCustomerProfile(c);
	}
	
	@GetMapping("/employee/{id}")
	public Employee findByEmployeeId(@PathVariable int id) {
		return service.findByEmployeeId(id);
	}
	
	@PostMapping("/feedback")
	public Message addFeedback(@RequestBody Feedback f) {
		return service.addFeedback(f);
	}
	
	@GetMapping("/feedback/{id}")
	public Feedback findByFeedbackID(@PathVariable int id) {
		return service.findByFeedbackID(id);
	}
	@PutMapping("/employee/update/{id}")
	public Message updateEmployeeInformation(@PathVariable int id,@RequestBody  Employee emp) {
		return service.updateEmployeeInformation(id,emp);
	}
	
	@GetMapping("/feedback-branch/{bid}")
	public List<Feedback> findAllFeedbackByBranchID(@PathVariable int bid){
		return service.findAllFeedbackByBranchID(bid);
	}
	
	
	@GetMapping("/order")
	public Iterable<Order> findAllOrder(){
		return service.findAllOrder();
	}
	
	@GetMapping("/order-branch/{bid}")
	public List<Order> findAllOrderByBranchID(@PathVariable int bid){
		return service.findAllOrderByBranchID(bid);
	}
	@GetMapping("/order-customer/{bid}")
	public List<Order> findAllOrderByCustomerID(@PathVariable int bid){
		return service.findAllOrderByCustomerID(bid);
	}

	
	@GetMapping("/products-stock")
	@PreAuthorize("hasAuthority('ADMIN')")
	public List<Product> findAllStock(){
		return service.findAllStock();
	}
	
	@GetMapping("/employee-branch/{bid}")
	public List<Employee> findEmployeeByBranchID(@PathVariable int bid){
		return service.findEmployeeByBranch(bid);
	}
	
	@PutMapping("/reply")
	public Message addReplyToFeedback(@RequestBody Reply r) {
		return service.addReplyToFeedback(r);
	}

	@PutMapping("/employee/{id}")
	public Message UpdateSalary(@PathVariable int id,@RequestBody  Employee emp){
		return service.updateSalary(emp, id);
	}	
	
	@PostMapping("/employee")
	public Message add(@RequestBody Employee e) {
		return service.addEmployee(e);
	}
	
	@DeleteMapping("/employee/delete/{id}")
	public Message deleteEmployee(@PathVariable int id) {
		return service.deleteEmployee(id);
	}
	
	@GetMapping("/employee")
	public Iterable<Employee> findAllEmployee(){
		return service.findAllEmployee();
	}
	
	@GetMapping("/feedback")
	public Iterable<Feedback> findAllFeedback(){
		return service.findAllFeedback();
	}
	
	@GetMapping("/feedback-customer/{cid}")
	public List<Feedback> findFeedbackByCustomerID(@PathVariable int cid){
		return service.findFeedbackByCustomerID(cid);
	}
	
	@GetMapping("/product/{id}")
	public Optional<Product> addProductByID(@PathVariable int id){
		return service.addProductById(id);
	}
	
		
	}
}