package com.walmart.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtils {
	public static final Properties pro = new Properties();

	public ConfigUtils(String fileName) {
		try {
			pro.load(new FileInputStream(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getProperty(String key) {
		return pro.getProperty(key);
	}
}
