package mobileTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import baseline.AutoContext;
import baseline.SwipeableWebDriver;
import testCase.MobileCaseTemplate;

public class MobileTestEnd extends MobileCaseTemplate {
	
	static final Logger logger = LoggerFactory.getLogger(MobileTestEnd.class);
	public SwipeableWebDriver driver = AutoContext.swipeableWebDriverTL.get();
	
	@Test
	public void quitDriver() {
		driver.quit();
	}

}
