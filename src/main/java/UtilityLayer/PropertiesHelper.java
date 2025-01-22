package UtilityLayer;

import java.io.FileInputStream;
import java.util.Properties;

import BaseLayer.BaseClass;

public class PropertiesHelper extends BaseClass {

	public static String getProperty(String keyName) {

		Properties prop = new Properties();

		String path = System.getProperty("user.dir") + "//src//main//java//ConfigurationLayer//config.properties";

		try {
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return prop.getProperty(keyName);

	}

}
