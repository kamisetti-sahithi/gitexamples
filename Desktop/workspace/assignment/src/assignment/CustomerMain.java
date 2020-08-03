package assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;



public class CustomerMain {
	public static void main(String args[]) {
		CustomerMain demo = new CustomerMain();
		demo.runApp();
	}
	private Map<String, Customer> store = new HashMap<>();

	public void runApp() {
		try {
		
		Account account1 = new Account(500, "IPKSR47");
		Account account2 = new Account(1000, "SKYWA57");
		RegularCustomer customer1 = new RegularCustomer("1A", "lalli", "Vijayawada",account1);
		//customer1.setAccount(account1);
		BusinessCustomer customer2 = new BusinessCustomer("2A", "sahithi", "eluru",account2);
		//customer2.setAccount(account2);

		store.put(customer1.getName(), customer1);
		store.put(customer2.getName(), customer2);
		displayAll();
		}
		catch(InvalidCustomerArgumentException e)
		{
			System.out.println("customer is null");
		}
		
			
	 catch(Exception e) {
			System.out.println("some error occured in program");
			
		}
	}
	
		public void displayAll() {
			Set<String> keys = store.keySet();
			for (String key : keys) {
				Customer current = store.get(key);
				boolean isRC = current instanceof RegularCustomer;
				if (isRC) {
					RegularCustomer RC = (RegularCustomer) current;
					display(RC);

				}
				boolean isBC=current instanceof BusinessCustomer;
				if(isBC) {
					BusinessCustomer BC=(BusinessCustomer) current;
					display(BC);
				}
			}
			
			}
		
		public void checkNull(Customer customer) {
			if(customer==null) {
				InvalidCustomerArgumentException exception=new InvalidCustomerArgumentException("null argument");
				throw exception;
			}
		}
		public void displayCustomer(Customer customer) {
			checkNull(customer);
			String customerId=customer.getId();
			String name=customer.getName();
			System.out.println("customer id is"+ customerId +"name is"+ name);
			Account account=customer.getAccount();
			System.out.println(account.getBalance() + " " +account.getPancard());
			System.out.println("\n");
		}
		public void display(RegularCustomer customer) {
			checkNull(customer);
			displayCustomer(customer);
			System.out.println("houseaddress="+customer.getHomeAddress());
			
			
		}
		public void display(BusinessCustomer customer) {
			checkNull(customer);
			displayCustomer(customer);
			System.out.println("businessaddress="+customer.getBusinessAddress());
			
			
		}
		
		
			
		
		

	}


