package service;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import entity.Customer;

public interface RRSservice {
	LinkedHashMap<Integer,Customer> ac =new LinkedHashMap<Integer, Customer>();
	LinkedHashMap<Integer,Customer> nonac=new LinkedHashMap<Integer, Customer>();
	LinkedHashMap<Integer,Customer> deluxe =new LinkedHashMap<Integer, Customer>();
	ArrayList<Customer> L1=new ArrayList<Customer>();

	void roominfo();
	void checkAvailability();
	void checkIn();
	
	 void allocate(LinkedHashMap<Integer, Customer>  m,double camt,String roomType,int roomno);
	 
	void checkOut();
}
