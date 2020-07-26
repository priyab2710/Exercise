package com.xero.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties{
	public Properties prop;

	public FileInputStream ReadPropertiesFile() throws IOException {
		prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\resources\\data.properties");

		prop.load(fis);

		return fis;

	}
}
