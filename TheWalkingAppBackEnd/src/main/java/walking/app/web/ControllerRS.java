package walking.app.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import walking.app.entities.Message;
import walking.app.entities.Order;
import walking.app.entities.Product;
import walking.app.service.CentralizedDataService;

@RestController @RequestMapping ("/TheWalkingApp")

public class ControllerRS{
	
	@Autowired
	private CentralizedDataService service;
	
	
	@GetMapping("")
	public String home(){
        return "Hello World!";
    }
	
	@GetMapping("/user")
	public String user() {
		return("<h1>Welcome user</h1>");
	}
	
	@GetMapping("/admin")
	public String admin() {
		return("<h1>Welcome Admin</h1>");
	}
	
	
	
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
	@PostMapping("/products")
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
	
	@PutMapping("/employee/")
	public Message updateEmployeeInformation(@RequestParam String name,@RequestParam double salary,@RequestParam int dateWorked,@RequestParam int eid) {
		return service.updateEmployeeInformation(name,salary,dateWorked,eid);
	}
	


}
