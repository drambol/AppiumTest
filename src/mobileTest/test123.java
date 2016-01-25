package mobileTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import utility.system.WindowsProcess;

public class test123 {
	
	static final Logger logger = LoggerFactory.getLogger(AppiumTest.class);
	
	@Test
	public void test() throws InterruptedException {
		WindowsProcess.killProcess("emulator-arm.exe");
		WindowsProcess.killProcess("node.exe");
	}
	
}
