
package studentgrade;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hadeel
 */
public class StudentGradeTest {
    
    int mark;
    String expectedResult;
    
    //Method annotated with `@BeforeClass` will execute once before any of the test methods in this class.
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Entering StudentGradeTest Class \n");
    }
    
    //Method annotated with `@AfterClass` will execute once after all of the test methods are executed in this class.
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Exiting StudentGradeTest Class \n");
    }
    
    //Method annotated with `@Before` will execute before each test method in this class is executed.
    @Before
    public void setUp() {
        System.out.print("Start Test Case >\n");
    }
    
    //Method annotated with `@After` will execute after each test method in this class is executed.
    @After
    public void tearDown() {
        System.out.println("Expected: (" + expectedResult + ")\nActual:   (" + StudentGrade.getGrade(mark) +")");
        System.out.println("End the Test Case of grade " + mark +" \n");
    }

    
    @Test
    public void testGetGrade90() {
       mark = 90;
       expectedResult = "A";
       assertEquals(expectedResult, StudentGrade.getGrade(mark));
    }
    
    //A public void method annotated with @Test will be executed as a test case.
    @Test
    public void testGetGrade89() {
       mark = 89;
       expectedResult = "B";
       assertEquals(expectedResult, StudentGrade.getGrade(mark));
    }
    
    @Test
    public void testGetGrade70() {
       mark = 70;
       expectedResult = "F";
       assertEquals(expectedResult, StudentGrade.getGrade(mark));
    }
}
