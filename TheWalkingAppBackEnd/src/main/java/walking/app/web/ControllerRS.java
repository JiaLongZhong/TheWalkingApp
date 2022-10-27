package walking.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import walking.app.entities.Product;
import walking.app.service.CentralizedDataService;

@RestController @RequestMapping ("/TheWalkingApp")

public class ControllerRS
	{
	@Autowired
	private CentralizedDataService service;
	@GetMapping("/product/")
	public Iterable<Product> findAllProduct(){
		return service.findAllProduct();
	}
	}
