package Com.Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Com.Base.BaseClass;

public class DriverUtils extends BaseClass{
	public static String ScreenShot(String name) {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"/ScreenShots/"+name+".jpg";
		File dest = new File(path);
		
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return path;
		
		
	}

}
