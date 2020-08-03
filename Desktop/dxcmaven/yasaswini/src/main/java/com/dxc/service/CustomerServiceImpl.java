package com.dxc.service;
import java.util.List;
import com.dxc.dao.*;
import com.dxc.entities.Customer;
import com.dxc.exceptions.*;

public class CustomerServiceImpl implements ICustomerService {
private ICustomerDao dao = new CustomerDaoImpl();

	
	public Customer findById(int id) {
		checkId(id);
		Customer customer = dao.findById(id);
		return customer;
	}



	
	public List<Customer> findAll() {
		List<Customer>list=dao.findAll();
		return list;
	}

	
	
	public void checkId(int id) {
		if (id < 1) {
			throw new InvalidArgumentException("id cant be negative, id passed="+id);
		}
	}

	public void checkName(String name) {
		if (name == null || name.isEmpty()) {
			throw new InvalidArgumentException("name cant be null or empty");
		}
	}
	
	public void checkStudent(Customer customer) {
		if(customer==null) {
			throw new InvalidArgumentException("customer cant be null or empty");
				
		}
	}

	
	public Customer updateName(int id, String newName) {
		checkId(id);
		checkName(newName);
		Customer customer = dao.updateName(id, newName);
		return customer;
	}

	
	public Customer update(Customer customer) {
		checkStudent(customer);
		customer =dao.update(customer);
	    return customer;
	}

	
	public void add(Customer customer) {
		checkStudent(customer);
		dao.add(customer);
		
	}



	public void delete(int id) {
	  checkId(id);	
	  dao.delete(id);		
	}


}
	





