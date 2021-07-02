package programmer.zaman.now.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.util.*;


//@Tag("Integration-test")
public class ConditionTest {
    @Test
    public void testSystemProperties(){
        Properties properties = System.getProperties();
        properties.forEach((key, value) -> System.out.println(key+" : "+value));
    }

    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void testRunOnlyOnWindows(){

    }

    @Test
    @DisabledOnOs({OS.WINDOWS})
    public void testDisabledOnWindows(){

    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    public void testEnabledJava8(){

    }

    @Test
    @DisabledOnJre(JRE.JAVA_8)
    public void testDisabledJava8(){

    }

    @Test
    @EnabledForJreRange(min=JRE.JAVA_11,max=JRE.JAVA_15)
    public void testEnabledJava11to15(){

    }

    @Test
    @DisabledForJreRange(min=JRE.JAVA_11,max=JRE.JAVA_15)
    public void testDisabledJava11to15(){

    }

    @Test
    @EnabledIfSystemProperty(named = "java.vendor",matches = "Oracle Corporation")
    public void enableOnOracle(){

    }

    @Test
    //@EnabledIfSystemProperty(named = "java.vendor",matches = "Oracle Corporation")

    @EnabledIfSystemProperties({
            @EnabledIfSystemProperty(named="java.vendor",matches="Oracle Corporation")
    })
    public void testEnableOnJavaVendorOracle(){

    }

    @Test
    //@DisabledIfSystemProperty(named = "java.vendor",matches = "Oracle Corporation")
    @DisabledIfSystemProperties({
            @DisabledIfSystemProperty(named="java.vendor",matches="Oracle Corporation")
    })
    public void testDisabledOnJavaVendorOracle(){

    }

    @Test
    @EnabledIfEnvironmentVariables({
            @EnabledIfEnvironmentVariable(named="PROFILE", matches="DEV")
    })
    public void TestEnabledOnProfileDev(){

    }

    @Test
    @DisabledIfEnvironmentVariables({
            @DisabledIfEnvironmentVariable(named="PROFILE", matches="DEV")
    })
    public void TestDisabledOnProfileDev(){

    }
}
