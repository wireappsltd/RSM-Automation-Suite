package com.rsm.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;

	public ReadConfig() {
		File src = new File("./Configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is" + e.getMessage());
		}

	}

	public String getChromePath() {
		String ch = pro.getProperty("chromepath");
		return ch;
	}

	public String getFirefoxPath() {
		String ff = pro.getProperty("firefoxpath");
		return ff;
	}

	public String getRSMUrl() {
		String url = pro.getProperty("RSMUrl");
		return url;
	}

	public String getEmail() {
		String un = pro.getProperty("Email");
		return un;
	}

	public String getPassword() {
		String pw = pro.getProperty("Password");
		return pw;
	}
	
	public String getEmail2() {
		String un = pro.getProperty("Email2");
		return un;
	}

	public String getPassword2() {
		String pw = pro.getProperty("Password2");
		return pw;
	}

}
