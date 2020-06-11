package com.cjc.Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 extends Assert
{
	 @Test
	  public void m1()
	  {
		  
		  System.out.println("1");
		  assertEquals(10, 10);
		  
		  System.out.println("2");
		 assertEquals(1, 10);

		  System.out.println("3");
		 assertEquals("a", "a");

		  System.out.println("4");
		  assertEquals(2, 10);

		  
	  }
	  @Test
	  public void m2()
	  {
		  
		  System.out.println("5");
		  assertEquals(10, 10);
		  
		  System.out.println("6");
		  assertEquals(10, 10);

		  System.out.println("7");
		 assertEquals("a", "a");

		  System.out.println("8");
		  assertEquals(10, 10);

		  
	  }
}
