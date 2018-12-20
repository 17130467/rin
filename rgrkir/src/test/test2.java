package test;

import static org.junit.Assert.*;
import pack.MetodCalc;

public class test2 {

	 @org.junit.Test
	 public void testPlus()
	 {
	 MetodCalc mc = new MetodCalc();
	 double res= mc.calc(999, "+", 5);
	 assertEquals(Double.toString(1004), Double.toString(res));
	 }
	
	 @org.junit.Test
	 public void test_Minus()
	 {
	 MetodCalc mc = new MetodCalc();
	 double res=mc.calc(75, "-", 25);
	 assertEquals(Double.toString(50), Double.toString(res));
	 }

	 @org.junit.Test
	 public void test_Multiply()
	 {
	 MetodCalc mc = new MetodCalc();
	 double res=mc.calc(1243, "*", 5);
	 assertEquals(Double.toString(6215), Double.toString(res) );
	 }
	
	 @org.junit.Test
	 public void test_Divide()
	 {
	 MetodCalc mc = new MetodCalc();
	 double res=mc.calc(27, "/", 9);
	 assertEquals(Double.toString(3), Double.toString(res) );
	 }
}

