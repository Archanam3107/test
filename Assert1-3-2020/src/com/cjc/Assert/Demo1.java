package com.cjc.Assert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo1
{
	
	@Test
	public void m1()
	{
		SoftAssert sf=new SoftAssert();
		 System.out.println("1");
		  sf.assertEquals(10, 10);
		  
		  System.out.println("2");
		  sf.assertEquals(1, 10);

		  System.out.println("3");
		  sf.assertEquals("a", "a");

		  System.out.println("4");
		  sf.assertEquals(2, 10);
          sf.assertAll();
	}
	
	@Test
	 public void m2()
	  {
		  SoftAssert sf1=new SoftAssert();
		  System.out.println("5");
		  sf1.assertEquals(10, 10);
		  
		  System.out.println("6");
		  sf1.assertEquals(10, 10);

		  System.out.println("7");
		  sf1.assertEquals("a", "a");

		  System.out.println("8");
		  sf1.assertEquals(10, 10);
		  sf1.assertAll();

		  
	  }

 }
