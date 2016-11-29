import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AddressBook implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8064037983150519446L;
	List<BuddyInfo> addressBook;
	
	public AddressBook() {
		addressBook = new ArrayList<>();
	}
	
	public List<BuddyInfo> getList() {
		return addressBook;
	}
	public void addBuddyInfo(BuddyInfo bi) {
		addressBook.add(bi);
	}
	
	public void removeBuddy(BuddyInfo bi) {
		addressBook.remove(bi);
	}
	
	public void clear() {
		addressBook.clear();
	}
	
	
	public int size() {
		return addressBook.size();
	}
	
	public void display() {
		
		for(BuddyInfo bi : addressBook) {
			System.out.println(bi);
		}
	}
	
	public void export() throws IOException {
		File file = new File("test.txt");
		ObjectOutputStream bufferedWriter = new ObjectOutputStream(new FileOutputStream(file,true));
		for(BuddyInfo bi : addressBook) {
			bufferedWriter.writeObject(bi.toString());
		}
		bufferedWriter.close();
	}
	
	public void importThis(File file) throws IOException, ClassNotFoundException {
		ObjectInputStream bufferedReader = new ObjectInputStream(new FileInputStream(file));
		Object object = bufferedReader.readObject();
		System.out.println(object);
		BuddyInfo info = BuddyInfo.importThis((String) object);
		addressBook.add(info);
		bufferedReader.close();
	}
	
	public static void main(String args[]) {
		
		
	}

}
