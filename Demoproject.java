package Projects;

import java.util.ArrayList;
import java.util.Scanner;



public class Demoproject {
	
		 private ArrayList<Reservation> reservations=new ArrayList< >();
		 
		  public void addReservation(String guestName,int roomNumber,int numberOfNights)
		 {
			   Reservation  reservation=new Reservation(guestName,roomNumber,numberOfNights);
			   reservations.add(reservation);
			   System.out.println("Reservation added succesfully");	   
		 }
		  public void viewReservation()
		  {
			  if(reservations.isEmpty())
			  {
				  System.out.println("no reservation found");
			  }
			  else
			  {
				 System.out.println("list of reservations");
				 
				 for(Reservation reservations:reservations)
				 {
					 System.out.println(reservations);
				 }
			  }  
		  }
		   public static void main(String[] args)
		  {
			Demoproject hotelSystem=new Demoproject();
			Scanner scanner=new Scanner(System.in);
			while(true)
			{
				System.out.println("-------Hotel reservation system name----");
				System.out.println("click 1 add reservation");
				System.out.println("click 2 add reservation");
				System.out.println("click 3 add reservation");
				System.out.println("enter your choice");
				int choice=scanner.nextInt();
				switch(choice)
				{
				case 1:
				
				System.out.println("enter your name");
				String guestName=scanner.next();
				System.out.println("enter your roomnumber");
				int roomNumber=scanner.nextInt();
				System.out.println("enter your night");
				int numberOfNights =scanner.nextInt();
				hotelSystem.addReservation(guestName,roomNumber,numberOfNights);
				break;
				case 2:
					hotelSystem.viewReservation();
					break;
				case 3:
					System.out.println("thank you for visit");
					scanner.close();
					System.exit(0);
					default:
					System.out.println("invalid choice");
					break;
					
			}
		  }
		 
		}
		}
	
	

	
