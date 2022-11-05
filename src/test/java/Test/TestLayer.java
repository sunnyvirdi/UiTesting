package Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.BaseClass.java.BaseClass;

import POM.POMClass;

public class TestLayer extends BaseClass {
	


	POMClass abc;
	
	@BeforeSuite
	public void startup() {
		
		initialization();
		}
	
	
	@Test
	public void signup() throws InterruptedException{
		
	abc= new POMClass();
	
	abc.signupbutton("preetheer125@com", "preet12345");
	Thread.sleep(2000);
	abc.homepagemenu();
	Thread.sleep(2000);
	abc.noteswindow();
	Thread.sleep(2000);
	abc.addingnote("Api", "Api testing");
	Thread.sleep(2000);
	abc.savenote();
	Thread.sleep(2000);
	abc.deletenote();
	Thread.sleep(2000);
	abc.logout();
	driver.quit();
	
	}
	
}
