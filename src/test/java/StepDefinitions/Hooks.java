package StepDefinitions;

import Utilities.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{
	//public static WebDriver driver;

    @Before
    public void setUp() {
        if (driver == null) {
        	browserLaunch("Chrome");
            maximize();
        }
    }

//    @After
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//            driver = null;
//        }
//    }
}
