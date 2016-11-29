<<<<<<< HEAD
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


}
=======
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuddyInfo implements ActionListener {
	
	private String name;
	private int age;
	
	public BuddyInfo(String name, int age) {
			this.name = name;
			this.age = age;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//Change in order to pull
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}



}
>>>>>>> branch 'master' of https://github.com/Taz-ZSchool/BuddyProj.git
