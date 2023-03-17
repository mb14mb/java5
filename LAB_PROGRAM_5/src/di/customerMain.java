package di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class customerMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Customer cus = (Customer) context.getBean("customer");
		System.out.println("With all arguments");
		cus.display();
		
		Customer cus1 = (Customer) context.getBean("customer1");
		System.out.println(" ");
		System.out.println("With age arguments");
		cus1.display();
		
		Customer cus2 = (Customer) context.getBean("customer2");
		System.out.println(" ");
		System.out.println("With name arguments");
		cus2.display();
		
		
		
	}

}
