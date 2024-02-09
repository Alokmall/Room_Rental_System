package serviceimpln;
import java.util.LinkedHashMap;
import java.util.Scanner;

import entity.Address;
import entity.Customer;
import service.RRSservice;

public  class RRSserviceimpln implements RRSservice{
	Scanner ip=new Scanner(System.in);
	 {
		for (int i=101;i<=108;i++) {
			ac.put(i,null);
		}
	}
	@Override
	public void roominfo() {
		System.out.println("=========Room details=======");
		System.out.println("=========AC Rooms===========");
		System.out.println("1.AC\n2.TV\n3.WIFI\n4.Fridge");
		System.out.println("Price:2500/Day");
	}
	@Override
	public void checkAvailability() {
		System.out.println("========AC Rooms=========");
		int c=0;
		for(int key:ac.keySet()) {
			if(ac.get(key)==null) {
				System.out.println(key+" ");
				c++;
			}
		}
		if(c==0) {
				System.out.println("All Rooms Occupied");
		}
		System.out.println();
	}
	public void nam() {
		
	}
	@Override
	public void checkIn() {
		System.out.println("===========Check-In=========");
		System.out.println("========Rooms Details=======");
		System.out.println("1.AC\n2.Non-Ac\n3.Deluxe");
		System.out.println("====Enter Your Option=========");
		int op=ip.nextInt();
		System.out.println("Please Enter the Roomno:-");
		int roomno=ip.nextInt();
		
		switch(op) {
		case 1:if(ac.containsKey(roomno) && ac.get(roomno)==null){
			allocate(ac,2500,"Ac",roomno);
		}
		else {
			System.out.println("Invalid Room no or Room is not available..!!");
		}
		break;
		case 2:System.out.println("Need to be implemented");break;
		case 3:System.out.println("need to be implemented");break;
		default:System.out.println("Invalid Option");
		}
	}
	
	public void checkOut() {
		System.out.println("===========Check-Out=========");
		System.out.println("========Rooms Details=======");
		System.out.println("1.AC\n2.Non-Ac\n3.Deluxe");
		System.out.println("====Enter Your Option=========");
		int op=ip.nextInt();
		System.out.println("Please Enter the Roomno:-");
		int roomno=ip.nextInt();
		System.out.println("Please Enter Customer Id");
		int cid=ip.nextInt();
		switch(op) {
		case 1:if(ac.containsKey(roomno) && ac.get(roomno)!=null && ac.get(roomno).getCid()==cid){
			System.out.println(ac.get(roomno).getCname()+" Thanks for visiting..!!");
			ac.put(roomno, null);
		}
		else {
			System.out.println("Invalid Credentials...!!!");
		}
		break;
		case 2:System.out.println("Need to be implemented");break;
		case 3:System.out.println("need to be implemented");break;
		default:System.out.println("Invalid Option");
		}
		
		}
		
	

	@Override
	public void allocate(LinkedHashMap<Integer, Customer> m, double camt, String roomType, int roomno) 
		{
			System.out.println("=====Customer Details=====");
			System.out.println("Please Enter Custmer id:-");
			int cid=ip.nextInt();
			System.out.println("Please enter Customer name:-");
			String cname=ip.next();
			System.out.println("Please enter Customer phno:-");
			int cphno=ip.nextInt();
			System.out.println("Please enter the house No:-");
			String houseNo=ip.next();
			System.out.println("Please enter the Street Name:-");
			String StreetName =ip.next();
			System.out.println("Please enter location pincode:-");
			int pin=ip.nextInt();
			Address a=new Address(houseNo, StreetName, pin);
			Customer c=new Customer(cid,cname,cphno,a,camt,roomType);
			L1.add(c);
			m.put(roomno, c);
			System.out.println(c.getCname()+" had allocate for "+roomType+"room no:"+roomno);
			System.out.println("Amount need to paid:"+camt);
			
}
}