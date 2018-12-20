package test;
import static org.junit.Assert.*;
import org.junit.Test;
import pack.tax;
public class test {
	
	tax tax = new tax();
	
	@Test
	public void testTax() throws InterruptedException
	 {
	 
	 double res= tax.calcTax(450000, 1, 30);
	 double toch=134580.0;
	 assertEquals(Double.toString(res),Double.toString(toch));
	 }
}
