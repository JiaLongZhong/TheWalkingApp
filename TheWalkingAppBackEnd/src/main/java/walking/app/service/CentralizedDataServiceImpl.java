package walking.app.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import walking.app.dao.ProductDao;
import walking.app.entities.Product;
import walking.app.dao.BranchDao;
import walking.app.dao.CartDao;
import walking.app.dao.CustomerDao;
import walking.app.dao.EmployeeDao;
import walking.app.dao.FeedbackDao;
import walking.app.dao.ManagerDao;
import walking.app.dao.OrderDao;
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

//	@Override
//	public Message updateEmployeeInformation(String name, double salary, int dateWorked, int eid) {
//		Message m=new Message();
//		try {
//			empDao.updateEmployeeInformation(name,salary,dateWorked,eid);
//			logger.info("Employee information updated succesfully");
//			   m.setS("Success");
//			}catch(Exception ex) {
//				m.setS("Error:"+ex);
//				logger.error("Error:"+ex);
//				ex.printStackTrace();
//			}
//			return m;
//	}
	

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

	
	

	
}
