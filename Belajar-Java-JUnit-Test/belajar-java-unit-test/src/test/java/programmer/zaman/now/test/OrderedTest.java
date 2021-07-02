package programmer.zaman.now.test;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTest {

    private int counter = 0;

//    @BeforeAll
//    static void beforeAll() {
//
//    }
//
//    @AfterAll
//    static void afterAll() {
//
//    }

    @BeforeAll
    void beforeAll() {

    }

    @AfterAll
    void afterAll() {

    }

    @Test
    @Order(1)
    public void Test3(){
        counter++;
        System.out.println(counter);
    }

    @Test
    @Order(2)
    public void Test2(){
        counter++;
        System.out.println(counter);
    }

    @Test
    @Order(3)
    public void Test1(){
        counter++;
        System.out.println(counter);
    }
}
