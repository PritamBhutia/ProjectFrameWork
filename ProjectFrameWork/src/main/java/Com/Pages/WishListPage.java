package Com.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {
	WebDriver wpdriver= null;
	public WishListPage(WebDriver driver) {
		this.wpdriver= driver;
		PageFactory.initElements(driver,this);
	

}

	@FindBy(xpath="//td")
	List<WebElement>Models;
	
	public ArrayList<String>VerifyModels(){
	ArrayList<String> ActualModel=new ArrayList<String>();
	for (WebElement model :Models) {
		String text=model.getText();
		ActualModel.add(text);
		
	}
	return ActualModel;
	
}
	public boolean ActualModel1() {
		ArrayList<String>ActualModel=new ArrayList<String>();
		for (WebElement model : Models) {
			String text=model.getText();
			ActualModel.add(text);
		
		}
		ArrayList<String>ExpectedModel= new ArrayList<String>();
		ExpectedModel.add("Sony Vaio 20\" Model");
		ExpectedModel.add("Sony Vaio 22\" Model");
		ExpectedModel.add("Sony Vaio 26\" Model");
		ExpectedModel.add("Sony Vaio 27\" Model");
		if(ActualModel.containsAll(ExpectedModel))
			return true;
		else 
		return false;
	}
}