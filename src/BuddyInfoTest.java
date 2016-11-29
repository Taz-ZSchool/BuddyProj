import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BuddyInfoTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		BuddyInfo buddyInfo = new BuddyInfo("Taz", "Carleton", "3110");
		BuddyInfo buddyInfo2 = BuddyInfo.importThis("Taz$Carleton$3110");
		assertEquals(buddyInfo, buddyInfo2);
	}

}
