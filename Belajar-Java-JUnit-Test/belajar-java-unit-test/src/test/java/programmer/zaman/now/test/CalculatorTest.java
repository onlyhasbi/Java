package programmer.zaman.now.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions.*;
import org.opentest4j.TestAbortedException;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import programmer.zaman.now.test.generator.SimpleDisplayNameGenerator;


//@DisplayName("Test operasi Calculator")
@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before All");
    }

    @AfterAll
    public static void AfterAll(){
        System.out.println("After All");
    }

    @BeforeEach
    public void setUp(){
        System.out.println("Before Each");
    }

    @AfterEach
    public void tearDown(){
        System.out.println("After Each");
    }

    @Test
    //@DisplayName("Skenario penambahan data")
    public void testAddSuccess(){
        var result = calculator.sum(34,32);
        assertEquals(66,result);
    }

    @Test
    //@DisplayName("Skenario pembagian data")
    public void testDivideSuccess(){
        var result = calculator.divide(100,10);
        assertEquals(10,result);
    }

    @Test
    //@DisplayName("Skenario pembagian gagal data")
    public void testDivideFailed(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
            calculator.divide(10,0);
        });
    }

    @Test
    @Disabled //menonaktifkan test
    public void comingSoon(){

    }

    @Test
    public void testAborted(){
        var profile = System.getenv("PROFILE");
        if(!"DEV".equals(profile)){
            throw new TestAbortedException("Test dibatalkan karena bukan DEV");
        }
    }

    @Test
    public void testAssumptions(){
        assumeTrue("DEV".equals(System.getenv("PROFILE")));
    }
}
