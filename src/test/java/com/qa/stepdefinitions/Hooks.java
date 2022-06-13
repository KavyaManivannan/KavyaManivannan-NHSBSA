package com.qa.stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa.utils.Base;

import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base{

	Scenario scn;	

	@Before
	public void Setup() throws IOException {
		
		 //Initializing browser and landing in start page
		driver = Base.initializeDriver();
	}

	@After
	public void CleanUp(Scenario s) {

		this.scn = s;

		//screenshot for the results
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");

		String screenshotName = scn.getName().replaceAll(" ", "_");
		TakesScreenshot ts = (TakesScreenshot)driver;

		byte[] data = ts.getScreenshotAs(OutputType.BYTES);
		scn.attach(data, "image/png", screenshotName);
		
		//Quitting the driver
		driver.quit();

	}
}
