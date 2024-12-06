package testngPackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertClass {
  @Test
  public void f() {
	  
	  String a="vipul";
	  String b="vipula";
	  
	  Assert.assertEquals(a,b);  // Hard Assert
	  
	 // SoftAssert s=new SoftAssert(); // soft assert
	 // s.assertEquals(a,b);
	  System.out.println("asser result");
	 // s.assertAll();  // Mandatory for soft assert
	  
  }
}
