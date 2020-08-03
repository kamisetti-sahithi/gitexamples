package com.dxc.dao;
import java.util.List;
import com.dxc.entities.Customer;

public interface ICustomerDao {
	Customer findById(int id);
	List<Customer> findAll();
	Customer updateName(int id,String newName);
	void add(Customer customer);
	Customer update(Customer customer);
	void delete(int id);

	
}



