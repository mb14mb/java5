package di;

public class Ticket {
	
	int ticket_no;
	String place;
	int price;
	Customer customer;
	
	
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getTicket_no() {
		return ticket_no;
	}
	public void setTicket_no(int ticket_no) {
		this.ticket_no = ticket_no;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void display() {
		System.out.println("Ticket No is : "+ticket_no);
		System.out.println("Place is : "+place);
		System.out.println("Price is : "+price);
		System.out.println("Customer age is "+customer.getAge());
		System.out.println("Customer name is "+customer.getName());
	}

}
