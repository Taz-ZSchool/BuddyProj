import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AddressBookTest {

	AddressBook addressBook; 
	AddressBook addressBook2;
	@Before
	public void setUp() throws Exception {
		addressBook = new AddressBook();
		addressBook2 = new AddressBook();
	}


	@Test
	public void testLists() {
	
		addressBook.addBuddyInfo(BuddyInfo.importThis("T$Street1$1"));
		//addressBook.addBuddyInfo(BuddyInfo.importThis("A$Street2$2"));
		//addressBook.addBuddyInfo(BuddyInfo.importThis("Z$Street3$3"));
		int initSize = addressBook.size();
		System.out.println("Trying to export");
		try {
			addressBook.export();
			System.out.println("Export");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("trying to import");
		try {
			System.out.println("import");
			addressBook2.importThis(new File("test.txt"));
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(addressBook.getList().get(0));
		System.out.println(addressBook2.getList().get(0));
		int finSize = addressBook.size();
		assertEquals(initSize, finSize);
		assertEquals(addressBook.getList(),addressBook2.getList());
	} 

}

