package com.dxc.service;
import java.util.*;
import com.dxc.entities.Customer;


public interface ICustomerService {
	Customer findById(int id);

	List<Customer> findAll();

	Customer updateName(int id, String newName);

	void add(Customer customer);

	Customer update(Customer customer);

	void delete(int id);

}
