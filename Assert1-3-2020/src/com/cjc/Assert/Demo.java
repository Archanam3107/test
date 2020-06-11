package com.cjc.Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo 
{
	//hardAssert
  @Test
  public void m1()
  {
	  
	  System.out.println("1");
	  Assert.assertEquals(10, 10);
	  
	  System.out.println("2");
	  Assert.assertEquals(1, 10);

	  System.out.println("3");
	  Assert.assertEquals("a", "a");

	  System.out.println("4");
	  Assert.assertEquals(2, 10);

	  
  }
  @Test
  public void m2()
  {
	  
	  System.out.println("5");
	  Assert.assertEquals(10, 10);
	  
	  System.out.println("6");
	  Assert.assertEquals(10, 10);

	  System.out.println("7");
	  Assert.assertEquals("a", "a");

	  System.out.println("8");
	  Assert.assertEquals(10, 10);

	  
  }

}
