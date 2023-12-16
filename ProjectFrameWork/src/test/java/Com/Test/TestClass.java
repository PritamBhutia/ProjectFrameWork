package Com.Test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Com.Base.BaseClass;
import Com.Pages.LoginPage;
import Com.Pages.WishListPage;

public class TestClass extends BaseClass{
	LoginPage lp =null;
	WishListPage wp = null;
	@BeforeSuite
	public void SetUp() throws Exception{
		Initialization();
	    ReportIniit();
	    lp= new LoginPage(driver);
		
	}
	@Test
	public void Test01() {
		wp= lp.Validlogin();

		
	}
	@Test
	public void Test02() {
		
		Assert.assertTrue(wp.ActualModel1());
		Assert.assertEquals(driver.getTitle(),"My Wish List");
	}
	@Test
	public void Test03() {
		throw new SkipException("Skip");
		
		
	}
	@Test
	public void Test04() {
		Assert.assertTrue(false);
		
	}
	
}
