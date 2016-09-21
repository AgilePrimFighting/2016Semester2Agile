package com.prime.customer.service;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prime.customer.model.Customer;

@Service
public class CustomerService {
	
	@PersistenceContext
	private EntityManager em;
	
	 public List<Customer> listAll() 
	 {
	        return em.createQuery("SELECT u FROM Customer u", Customer.class).getResultList();
	 }
	 
	 @Transactional
	 public Customer createNewCustomer(String product, String hasTrial, String firstName, 
			 String lastName, String email, String phone, String company, 
			 String country, String businessType, String addiMsg, String isSubscribe){
		 Customer customer = new Customer();
		 customer.setProduct(product);
		 customer.setDate(new Date());
		 customer.setHasTrial(hasTrial);
		 customer.setFirstName(firstName);
		 customer.setLastName(lastName);
		 customer.setEmail(email);
		 customer.setPhone(phone);
		 customer.setCompany(company);
		 customer.setCountry(country);
		 customer.setBusinessType(businessType);
		 customer.setAddiMsg(addiMsg);
		 customer.setIsSubscribe(isSubscribe);
		 em.persist(customer);
		 return customer;
	 }

}
