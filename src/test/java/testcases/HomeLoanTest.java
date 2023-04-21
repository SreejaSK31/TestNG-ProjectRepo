package testcases;
import org.testng.annotations.Test;

public class HomeLoanTest extends BaseClass{

	@Test(dependsOnMethods = "test2")
	public void test1() {
		System.out.println("Inside homeloan test1");
	}

	@Test(groups= {"sanity","Regression"})
	public void test2() {
		System.out.println("Inside homeloan test2");
	}

}
