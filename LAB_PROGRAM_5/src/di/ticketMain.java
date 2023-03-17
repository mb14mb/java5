package di;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ticketMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Ticket t1 = (Ticket) context.getBean("ticket");
		Customer cus = (Customer) context.getBean("customer");
		
		
		while(true) {
			System.out.println(" ");
			System.out.println("1.Print Default Values\n2.Print User Values\n3.Exit");
			int ch = sc.nextInt();
			
			if(ch==1) {
				System.out.println(" ");
				System.out.println("Config inputs");
				t1.setCustomer(cus);
				t1.display();
				
			}
			else if(ch==2) {
				System.out.println("Enter Ticket Number : ");
				int ticket_no = sc.nextInt();
				System.out.println("Enter Destination Place : ");
				String place = sc.next();
				System.out.println("Enter Price : ");
				int price = sc.nextInt();
				
				t1.setTicket_no(ticket_no);
				t1.setPlace(place);
				t1.setPrice(price);
				System.out.println(" ");
				System.out.println("User Inputs");
				t1.display();
			}
			else if(ch==3) {
				break;
			}else {
				System.out.println(" ");
				System.out.println("Enter proper option");
			}
		}	
		
	}

}
