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
