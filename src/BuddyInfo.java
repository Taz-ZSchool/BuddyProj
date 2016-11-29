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
	public String toXML() {
		return	"<BuddyInfo> \n \t<name> " + name + " </name> \n \t"  + "<street> " + street + " </street> \n \t" 
		+ "<number> " + number + " </number> \n<BuddyInfo>";
		
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
	
	public static void main(String args[]) {
		BuddyInfo buddyInfo = new BuddyInfo("Taz", "1", "2");
		System.out.println(buddyInfo.toXML());
	}
}

