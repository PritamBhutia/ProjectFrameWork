package Com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver lpdriver= null;
	public LoginPage(WebDriver driver) {
		this.lpdriver= driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(id="loginform-username")
	WebElement username;
	@FindBy(id="loginform-password")
	WebElement password;
	@FindBy(id="savebutton")
	WebElement loginbtn;
	
	public void LoginToTheApplication(String Uname,String Pass) {
		username.sendKeys(Uname);
		password.sendKeys(Pass);
		loginbtn.click();
		
	}
	
	public WishListPage Validlogin() {
		lpdriver.findElement(By.xpath("//a[@title='My Account']")).click();
		lpdriver.findElement(By.xpath("//a[text()='Login']")).click();
		username.sendKeys("PritamBhutia");
		password.sendKeys("Sibu@4545");
		loginbtn.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lpdriver.findElement(By.xpath("//*[@id=\"wishlist-total\"]/span")).click();
		return new WishListPage(lpdriver);
	}

}
