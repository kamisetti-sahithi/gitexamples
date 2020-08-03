package com.dxc.ui;
import com.dxc.entities.*;
import com.dxc.exceptions.*;
import com.dxc.service.*;
import java.util.*;


public class CustomerMain {
	private ICustomerService service=new CustomerServiceImpl();
	public static void main(String args[]) {
		CustomerMain demo=new CustomerMain();
		demo.runApp();
	}
	public void runApp() {
		try {
			Account account1=new Account(1000,"ASDFGH");
			Account account2=new Account(1500,"QWERTY");
			Customer customer1=new RegularCustomer(1,"sahithi","eluru",account1);
			service.add(customer1);
			int id1=customer1.getId();
			Customer customer2=new BusinessCustomer(2,"pragati","vijayawada",account2);
			service.add(customer2);
			int id2=customer2.getId();
			service.delete(customer2.getId());
			service.updateName(customer1.getId(), "navya");
			
	       displayAll();
		}catch(InvalidArgumentException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		catch(CustomerNotFoundException e) {
			 e.printStackTrace();
			 System.out.println(e.getMessage());
		}
		
		catch(Exception e) {
		 e.printStackTrace();
		 System.out.println("some thing went wrong");
		}
			
			
			
		}
	public void displayAll() {
		List<Customer> list = service.findAll();
		for (Customer customer : list) {
			
			boolean isRC = customer instanceof RegularCustomer;
			if (isRC) {
				RegularCustomer RC = (RegularCustomer) customer;
				display(RC);

			}
			boolean isBC=customer instanceof BusinessCustomer;
			if(isBC) {
				BusinessCustomer BC=(BusinessCustomer) customer;
				display(BC);
			}
		}
	}
	public void displayCustomer(Customer customer) {
		
		int id=customer.getId();
		String name=customer.getName();
		System.out.println("customer id is"+ id +"name is"+ name);
		Account account=customer.getAccount();
		System.out.println(account.getBalance() + " " +account.getPancard());
		System.out.println("\n");
	}
	public void display(RegularCustomer customer) {
		
		System.out.println("houseaddress="+customer.getHomeAddress());
		
		
	}
	public void display(BusinessCustomer customer) {
		
		System.out.println("businessaddress="+customer.getBusinessAddress());
		
		
	}
	
	
		
	}





