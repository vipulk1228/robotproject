package testngPackage;

import org.testng.annotations.*;

public class ThirdClass {
  @AfterMethod
  void login() {
	  System.out.println("@AfterMethod");
  }
  @AfterClass
  void login1() {
	  System.out.println("@AfterClass");
  }
  
  @AfterTest
  void login9() {
	  System.out.println("@AfterTest");
  }
  
  @AfterSuite
  void login10() {
	  System.out.println("@AfterSuite");
  }
  
  @Test
  void login2() {
	  System.out.println(" @Test");
  }
  
  @BeforeSuite
  void login3() {
	  System.out.println("@BeforeSuite");
  }
  
  @BeforeClass
  void login4() {
	  System.out.println(" @BeforeClass");
  }
  
  @BeforeTest
  void login5() {
	  System.out.println("@BeforeTest");
  }
	  
@BeforeMethod
  void login6() {
	  System.out.println("@BeforeMethod");
  }
}
