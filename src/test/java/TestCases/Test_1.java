package TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.util.Properties;

import org.openqa.selenium.devtools.v130.systeminfo.SystemInfo;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.BasicSetup;
import PageObject.Homepage;

public class Test_1 extends BasicSetup{
	Homepage hp;
	Properties prop;
	@Test(priority=0)
	public void setCity() {
		hp=new Homepage(driver,wait);
		prop=super.prop;
		boolean actualCity = hp.setCity(prop.getProperty("city"));
		System.out.println("last push");
		Assert.assertTrue(actualCity);
	}
	/*
	 * @Test(priority=1) public void setMovie() { boolean
	 * Actual=hp.searchMovie(prop.getProperty("movie"));
	 * AssertJUnit.assertTrue(Actual); }
	 */
}
