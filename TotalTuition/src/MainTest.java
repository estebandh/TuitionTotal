import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void testCalculateTotalTuitionCost() {
		Main m = new Main();
		assertEquals(0, m.calculateTotalTuitionCost(0, 10), 0);
		assertEquals(400, m.calculateTotalTuitionCost(100, 0), 0); //400+400+400+400
		assertEquals(1500, m.calculateTotalTuitionCost(100, 1), 0); //100+200+400+800
	}
	
	@Test
	public void testCalculateMonthylPayment(){
		Main m = new Main();
		assertEquals(10, m.calculateMonthlyPayment(0, 120, 1), 0);
		assertEquals(20, m.calculateMonthlyPayment(1, 120, 1), 0);
		assertEquals(0, m.calculateMonthlyPayment(1, 0, 1), 0);
	}

}
