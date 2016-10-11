

import java.util.List;
import java.util.ArrayList;

public class AddressBook {
	
	private List<BuddyInfo> buddies;
	
	public AddressBook() { 
		buddies = new ArrayList<>();
	}
	
	
	public void addBuddy(BuddyInfo bi) {
		buddies.add(bi);
	}
	
	public void removeBuddy(BuddyInfo bi) {
		buddies.remove(bi);
	}

}
