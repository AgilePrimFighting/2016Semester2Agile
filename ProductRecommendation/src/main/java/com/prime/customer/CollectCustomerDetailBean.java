package com.prime.customer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.prime.customer.model.Customer;
import com.prime.customer.service.CustomerService;
import com.prime.email.service.EmailService;
import com.prime.product.model.Product;
import com.prime.question.service.ResponseService;
import com.prime.response.model.Response;

@Controller
@Scope("session")
public class CollectCustomerDetailBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(CollectCustomerDetailBean.class.getName());

	private Customer customer;
	private Product product;
	private List<Response> responseList;

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private ResponseService responseService;

	@Autowired
	private EmailService emailService;

	
	public void init(Product product, List<Response> responseList) {
		clearSession();
		setProduct(product);
		setResponseList(responseList);
	}
	
	private void clearSession(){
		customer = new Customer();
		product = new Product();
		responseList = new ArrayList<Response>();
	}

	
	public String submitDetail() {
		customer.setDate(new Date());
		customer.setProduct(product);
		customer.setProductName(product.getProductName());
		customer = customerService.persistCustomer(customer);
		for (Response res : responseList) {
			res.setCustomer(customer);
			//TODO update response
			//responseService.createResponse(res);
		}
		emailService.sendCustomerResponseEmail(customer, responseList);
		clearSession();
		return "Thankyou?faces-redirect=true";
	}
	

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Response> getResponseList() {
		return responseList;
	}

	public void setResponseList(List<Response> responseList) {
		this.responseList = responseList;
	}
	
	public boolean getIsSubscribe(){
		if("Yes".equals(customer.getIsSubscribe())) return true;
		else return false;
	}
	
	public void setIsSubscribe(boolean isSubscribe){
		if(isSubscribe) customer.setIsSubscribe("Yes");
		else customer.setIsSubscribe("No");
	}
}
