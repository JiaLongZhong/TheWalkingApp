package walking.app.service;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import walking.app.dao.ProductDao;
import walking.app.dao.CustomerDao;
import walking.app.dao.OrderDao;
//import walking.app.entities.Message;
//import walking.app.entities.Product;
//import walking.app.entities.Customer;
//import walking.app.entities.Order;


@Service
public class CentralizedDataServiceImpl implements CentralizedDataService {
	//private static final Logger logger=LogManager.getLogger(CentralizedDataServiceImpl.class);
	
	@Autowired
	ProductDao proDao;
	
	@Autowired 
	CustomerDao cusDao;
	
	@Autowired 
	OrderDao ordDao;
	

	
}
