import java.util.ArrayList;
import java.util.Scanner;

public class BuddyInfo {
	String name, street, number;
	private final static String sep = "$";
	
	public BuddyInfo(String name, String street, String number) {
		this.name = name;
		this.number = number;
		this.street = street;
	}
	
	public BuddyInfo() {};
	
	public String toString() {
		return name + sep + street + sep + number;
	}
	
	public boolean equals(Object o) {
		BuddyInfo buddyInfo = (BuddyInfo) o;
		if(this.toString().equals(buddyInfo.toString())) return true;
		return false;
	}
	
	public static BuddyInfo importThis(String buddyInfo) {
		Scanner scanner = new Scanner(buddyInfo);
		scanner.useDelimiter("[$]");
		ArrayList<String> info = new ArrayList<>();
		while(scanner.hasNext()) {
			info.add(scanner.next());
		}
		return new BuddyInfo(info.get(0), info.get(1), info.get(2));
	}
)
