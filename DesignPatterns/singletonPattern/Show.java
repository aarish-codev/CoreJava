package singletonPattern;

import java.util.HashSet;
import java.util.Set;


    class Show
    {
	private static final Show Instance = new Show();
	
	 Set<String> availSeats;
	
	public static Show getInstance() {
	    return Instance;
	}
	private Show() {
	    availSeats = new HashSet<String>();
	    availSeats.add("A-1");
	    availSeats.add("A-2");
	}
	
	public boolean bookSeat(String seat) {
	    return availSeats.remove(seat);
	}
	
	private static void ticketBooked(String seat) {
	    //Show show = Show.getInstance();
	    Show show = new Show();
	    System.out.println(show.bookSeat(seat));
	    System.out.println(show);
	}
	
	public static void main(String[] args) {
	    ticketBooked("A-1");
	    ticketBooked("A-1");
	}
    
    }

