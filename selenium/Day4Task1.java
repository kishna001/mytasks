package selenium_programs.seleniumAssignments;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day4Task1 {
    @BeforeMethod
    public void beforeMethod() {
    	System.out.println("@Before Method is Executed");
    }
    @AfterMethod
    public void afterMethod() {
    	System.out.println("@After Method is Executed");
    }
    @Test
    public void testPass() {
    	System.out.println("This test is Passed");
    	Assert.assertTrue(1==1);
    }
    @Test
    public void testFail() {
    	System.out.println("This test is Failed");
    	Assert.assertTrue(1==2);
    }
}
