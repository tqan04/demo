package testdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("Test function");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest function");
  }

  @AfterTest
  public void afterTest() {
  }

}
