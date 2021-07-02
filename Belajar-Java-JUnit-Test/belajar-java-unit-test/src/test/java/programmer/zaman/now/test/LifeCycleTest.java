package programmer.zaman.now.test;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

public class LifeCycleTest {
    private String temp;

    @Test
    public void TestA(){
        temp = "Eko";
    }

    @Test
    public void TestB(){
        System.out.println(temp);
    }
}
