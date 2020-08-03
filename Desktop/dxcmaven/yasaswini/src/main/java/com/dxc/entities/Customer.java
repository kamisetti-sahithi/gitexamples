package com.dxc.entities;

public class Customer {
	
		private int id;
		private String name;
		private Account account;

		public Customer(int id, String name) {
			this.id = id;
			this.name = name;

		}
		public Customer(int id,String name,Account account) {
			this(id, name);
			this.account=account;
			
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Account getAccount() {
			return account;
		}

		public void setAccount(Account account) {
			this.account = account;
		}
		public boolean equals(Object argument) {
			if(this==argument)
			{
				return true;
			}
			if(argument==null ||(argument instanceof Customer)) {
				return false;
			}
			Customer that=(Customer)argument;
			boolean isequal=this.id==that.id;
			return isequal;
			
		}
		public String toString() {
			String str=id+" "+name+" ";
			return str;
		}

	}



