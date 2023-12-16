package Com.Utils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtils {
	
	public static String ReadProperty(String key) throws Exception {
		String path= System.getProperty("user.dir")+"/src/main/resources/Config.Properties";
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
		
		
		
	}

}
