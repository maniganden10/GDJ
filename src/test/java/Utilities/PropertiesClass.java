package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertiesClass {
	
	public static Properties getprop() throws IOException {
		Properties prop = new Properties();
		String path= System.getProperty("user.dir")+"/src/test/resources/Details.properties";
		FileInputStream file = new FileInputStream(path);
		prop.load(file);
		file.close();
		System.out.println("after PropertiesClass");
		return prop;
	}
	
}
