package Projects;
import java.util.*;

import javax.management.loading.PrivateClassLoader;

public class Reservation {
	  private String guestName;
	  private int roomNumber;
	  private int numberOfNights;
  public Reservation(String guestName, int roomNumber, int numberOfNights) {
	  
  }
		// TODO Auto-generated constructor stub
	
public String getGuestName()
  {
	  return guestName;			  
  }
   public int getRoomNumber()
 {
	  return  roomNumber;			  
 }
   public int getNumberOfNights()
 {
	  return  numberOfNights;			  
 }
   	public String toString()
   	{
   		return "Reservation:getGuestName:"+guestName+",RoomNumber:"+roomNumber+",Nights:"+numberOfNights;
   							
   	}
}





