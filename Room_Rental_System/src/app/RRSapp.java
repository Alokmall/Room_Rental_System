package app;

import java.util.Scanner;

import service.RRSservice;
import serviceimpln.RRSserviceimpln;

public class RRSapp {
    public static void main(String[] args) {
       
        
        Scanner ip=new Scanner(System.in);
        RRSservice r=new RRSserviceimpln();
        System.out.println("==========Welcome to Room Rental System=========");
        while(true) {
        	System.out.println("===Menu===");
        	System.out.println("1.RoomInfo\n2.Rooms Availability");
        	System.out.println("3.CheckIn\n4.CheckOut\n5.E3xit");
        	System.out.println("========Enter Your Option=========");
        	int op=ip.nextInt();
        	switch(op) {
        	case 1:r.roominfo(); break;
        	case 2:r.checkAvailability();break;
        	case 3:r.checkIn();;break;
        	case 4:r.checkOut();;break;
        	default:System.out.println("========Invalid Option=========");
        	
        	}
        }
    }
 }
