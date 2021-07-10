package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.BaseConfig;
import com.utility.Highlighter;
import com.utility.Screenshot;

public class BaseloginFacebook {
	public void getlogin() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(BaseConfig.getfile("URL"));
		driver.manage().window().maximize();
		MasterPageFactory obj = new MasterPageFactory(driver);
		Screenshot.getpics(driver,"homepage");
		Screenshot.getpics(driver,"login page");
		Screenshot.getpics(driver,"after login");
		Highlighter.addcolor(driver,obj.getEmail());
		obj.getEmail().sendKeys(BaseConfig.getfile("Email"));
		Highlighter.addcolor(driver, obj.getPassword());
		obj.getPassword().sendKeys(BaseConfig.getfile("Password"));
		Highlighter.addcolor(driver, obj.getlogin());
		obj.getlogin().click();
		driver.quit();

	}

}
