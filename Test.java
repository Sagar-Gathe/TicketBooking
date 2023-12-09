package p1;
import java.util.Scanner;
class Booking{

	private int bookingId=1234;
	private int departureDate;
	private int noOfTicket;
	private double price;
	private String cabinType;
	private double totalPrice;
	private String destination;

	Booking(){
     // object creation;
		price=100;
	}
	Booking(int bookingId,int departureDate,int noOfTicket,float price,String cabinType,String destination){
		this.bookingId=bookingId;
		this.departureDate=departureDate;
		this.noOfTicket=noOfTicket;
		this.price=price;
		this.cabinType=cabinType;
		this.destination=destination;
	}

  void setBookingId(int bookingId){
  	this.bookingId=bookingId+1;
  }
  void setDepartureDate(int departureDate){
  	this.departureDate=departureDate;
  }
  void setNoOfTicket(int noOfTicket){
  	this.noOfTicket=noOfTicket;
  }
  void setPrice(double price){

  	this.price=price;
  }
  void setCabinType(String cabinType){
  	this.cabinType=cabinType;
  }
  void setDestination(String destination){
  	this.destination=destination;
  }


  int getBookingId(){ return bookingId;}
  int getDepartureDate(){return departureDate;}
  int getNoOfTickets(){ return noOfTicket;}
  double getPrice(){ return price;}
  String getCabinType(){ return cabinType;}
  String getDestination(){ return destination;}

 public double totalPrice(){

      double total;
      total=noOfTicket*price;
      return total;
 }
 /*public String ticketConformation(){


 }*/

 public void displayTicket(Booking b1[]){

 	for(int i=0;i<b1.length;i++){
    
 	System.out.println("BookingId  : "+b1[i].getBookingId());
 	System.out.println("Departure Date : "+b1[i].getDepartureDate());
 	System.out.println("Number of Ticket : "+b1[i].getNoOfTickets());
 	System.out.println("Price Of Ticket : "+b1[i].getPrice());
 	System.out.println("Cabin Type : "+b1[i].getCabinType());
 	System.out.println("Total Price : "+b1[i].totalPrice());
 	System.out.println("Destination : "+b1[i].getDestination());
 	System.out.println("..............................................");

 }


 }
}
class Test{
 

 public static void main(String[] args) {

 	int n;
 	Scanner sc=new Scanner(System.in);
 	System.out.println("Enter the number of Person Booking Ticket : ");
 	n=sc.nextInt();
 	Booking b1[]=new Booking[n];
 	Booking b=new Booking();
 	for(int i=0;i<b1.length;i++)
 	{
 		

 		 b1[i]=new Booking();
 		 System.out.println("Enter Departure Date : ");
 		 b1[i].setDepartureDate(sc.nextInt());
 		 System.out.println("Enter Number Of Ticket You Want : ");
 		 b1[i].setNoOfTicket(sc.nextInt());
 		 sc.nextLine();
 		 System.out.println("Enter the Destination : ");
 		 b1[i].setDestination(sc.nextLine());

 		
 		 System.out.println("Enter the Cabin Type : ");
 		 b1[i].setCabinType(sc.nextLine());




 	}
 	System.out.println("............................................");
 	b.displayTicket(b1);
 



 	
 }

}