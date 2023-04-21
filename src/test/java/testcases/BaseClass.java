package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	@BeforeTest(alwaysRun=true)
	public void PreReq2() {
		System.out.println("Inside Before Test");

	}

	@BeforeMethod(alwaysRun=true)
	public void PreReq1() {
		System.out.println("Inside Before Method");

	}

	@AfterMethod(alwaysRun=true)
	public void PostAllTest1() {
		System.out.println("Inside After Method");
	}

	@AfterTest(alwaysRun=true)
	public void PostAllTest2() {
		System.out.println("Inside After Test");

	}

}
