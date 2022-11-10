package walking.app.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import walking.app.dao.ProductDao;
import walking.app.dao.ReplyDao;
import walking.app.entities.Product;
import walking.app.entities.Reply;
import walking.app.dao.BranchDao;
import walking.app.dao.CartDao;
import walking.app.dao.CustomerDao;
import walking.app.dao.EmployeeDao;
import walking.app.dao.FeedbackDao;
import walking.app.dao.ManagerDao;
import walking.app.dao.OrderDao;
import walking.app.entities.Cart;
import walking.app.entities.Customer;
import walking.app.entities.Employee;
import walking.app.entities.Feedback;
import walking.app.entities.Message;
import walking.app.entities.Order;
import walking.app.entities.Product;
//import walking.app.entities.Customer;
//import walking.app.entities.Order;


@Service
public class CentralizedDataServiceImpl implements CentralizedDataService {
	private static final Logger logger=LogManager.getLogger(CentralizedDataServiceImpl.class);
	
	@Autowired
	ProductDao proDao;
	
	@Autowired 
	CustomerDao cusDao;
	
	@Autowired 
	OrderDao ordDao;
	
	@Autowired
	EmployeeDao empDao;
	
	@Autowired
	ManagerDao manDao;
	
	@Autowired
	BranchDao braDao;
	
	@Autowired
	CartDao cartDao;
	
	@Autowired
	FeedbackDao fbDao;
	
	@Autowired 
	ReplyDao replyDao;
	
// product search
	@Override
	public Iterable<Product> findAllProduct() {
		Sort s=Sort.by("id");
		Iterable<Product> plist=proDao.findAll(s.ascending());
		logger.info("Found All Products");
		return plist;

	}
	
//  place order and payment. 
	@Override
	public Message addOrder(Order o) {
		Message m=new Message();
		try {
			ordDao.save(o);
			logger.info("Order successfully added");
			m.setS("Success");
		}catch(Exception ex) {
			m.setS("Error:"+ex);
			logger.error("Error:"+ex);
			ex.printStackTrace();
		}
		return m;
	}

	//adding product
	@Override
	public Message addProduct(Product p) {
		Message m=new Message();
		try {
		   proDao.save(p);
		   logger.info("Product added succesfully");
		   m.setS("Success");
		}catch(Exception ex) {
			m.setS("Error:"+ex);
			logger.error("Error:"+ex);
			ex.printStackTrace();
		}
		return m;
	}

	@Override
	public List<Product> findAllStockByBranch(int bid) {
		List<Product> pList= proDao.findAllStockByBranch(bid);
		return pList;
	}

	@Override
	public Customer findByCustomerId(int cid) {
		Customer c = cusDao.findByCustomerId(cid);
		return c;
	}
	
	@Override
	public Employee findByEmployeeId(int eid) {
		Employee e = empDao.findByEmployeeId(eid);
		return e;
	}

	@Override
	public Order findByOrderID(int OrderID) {
		Order o = ordDao.findByOrderID(OrderID);
		return o;
	}

	@Override
	public Message createCustomerProfile(Customer c) {
		Message m=new Message();
		try {
		   cusDao.save(c);
		   logger.info("Customer Profile Created succesfully");
		   m.setS("Success");
		}catch(Exception ex) {
			m.setS("Error:"+ex);
			logger.error("Error:"+ex);
			ex.printStackTrace();
		}
		return m;
	}

// add comment or feedback
	@Override
	public Message addFeedback(Feedback f) {
		Message m=new Message();
		try {
		   fbDao.save(f);
		   logger.info("Comment added succesfully");
		   m.setS("Success");
		}catch(Exception ex) {
			m.setS("Error:"+ex);
			logger.error("Error:"+ex);
			ex.printStackTrace();
		}
		return m;
	}

	@Override
	public Feedback findByFeedbackID(int fid) {
		Feedback f = fbDao.findByFeedbackID(fid);
		return f;
	}

	@Override
	public List<Feedback> findAllFeedbackByBranchID(int bid) {
		List<Feedback> f = fbDao.findAllFeedbackByBranchID(bid);
		return f;
	}

	@Override
	public List<Order> findAllOrder() {
		List<Order> olist = ordDao.findAllOrder();
		return olist;
	}

	@Override
	public List<Order> findAllOrderByBranchID(int bid) {
		List<Order> o = ordDao.findAllOrderByBranchID(bid);
		return o;
	}

	@Override
	public List<Order> findAllOrderByCustomerID(int bid) {
		List<Order> o = ordDao.findAllOrderByCustomerID(bid);
		return o;
	}

	@Override
	public List<Product> findAllStock() {
		List<Product> p = proDao.findAllStock();
		return p;
	}

	@Override
	public List<Employee> findEmployeeByBranch(int bid) {
		List<Employee> e = empDao.findEmployeeByBranch(bid);
		return e;
	}

	//working on it
	@Override 
	public Message updateSalary(Employee emp, int id) {
		Employee e = empDao.findByEmployeeId(id);
		Message m=new Message();
		double amt = emp.getSalary();
	
		try {	
			e.setSalary(e.getSalary()+amt);
			empDao.save(e);
			logger.info("Tranaction succesfully");
			m.setS("Tranaction  succussfully");
		}catch(Exception ex){
			logger.info("Unsuccessfull tranactions");
			m.setS("Unsuccessfull tranactions");
		}
		return m;
	}

	@Override
	public Message addReplyToFeedback(Reply r) {
		Message m=new Message();
		try {
			replyDao.save(r);
			logger.info("Order successfully added");
			m.setS("Success");
		}catch(Exception ex) {
			m.setS("Error:"+ex);
			logger.error("Error:"+ex);
			ex.printStackTrace();
		}
		return m;
	}

	@Override
	public Message updateEmployeeInformation(int id, Employee emp) {
		Employee e = empDao.findByEmployeeId(id);
		Message m=new Message();
		String name = emp.getName();
		double salary = emp.getSalary();
		int dateWorked = emp.getDateWorked();
		int offDay = emp.getOffDay();
		try {
			e.setName(name);
			e.setSalary(salary);
			e.setDateWorked(dateWorked);
			e.setOffDay(offDay);
			empDao.save(e);
			logger.info("Employee information updated succesfully");
			m.setS("Success");
			}catch(Exception ex) {
				m.setS("Error:"+ex);
				logger.error("Error:"+ex);
				ex.printStackTrace();
			}
			return m;
	}

	@Override
	public Message addEmployee(Employee emp) {
		Message m=new Message();
		try {
			empDao.save(emp);
			logger.info("Employee added successfully");
			m.setS("Success");
		}catch(Exception ex) {
			m.setS("Error:"+ex);
			logger.error("Error:"+ex);
			ex.printStackTrace();
		}
		return m;
	}

	@Override
	public Message deleteEmployee(int id) {
		Message m=new Message();
		Employee e = empDao.findByEmployeeId(id);
		try {
			empDao.delete(e);
			logger.info("Employee deleted successfully");
			m.setS("Success");
		}catch(Exception ex) {
			m.setS("Error:"+ex);
			logger.error("Error:"+ex);
			ex.printStackTrace();
		}
		return m;
	}

	
	@Override
	public Iterable<Employee> findAllEmployee() {
		Sort s=Sort.by("eid");
		Iterable<Employee> elist=empDao.findAll(s.ascending());
		logger.info("Found All Employee");
		return elist;

	}

	@Override
	public List<Feedback> findFeedbackByCustomerID(int fid) {
		List<Feedback> fList= fbDao.findFeedbackByCustomerID(fid);
		return fList;
	}
	

	@Override
	public Iterable<Feedback> findAllFeedback() {
		Sort s=Sort.by("id");
		Iterable<Feedback> flist=fbDao.findAll(s.ascending());
		logger.info("Found All Feedback");
		return flist;
	}

	@Override
	public Optional<Product> addProductById(int id) {
		return proDao.findById(id);
	}
	
	public List<Cart> listCartItems(Customer customer){
		return cartDao.findByCustomer(customer);
	}
	
}