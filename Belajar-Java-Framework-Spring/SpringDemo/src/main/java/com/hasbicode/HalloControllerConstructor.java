package com.hasbicode;

//@Component
public class HalloControllerConstructor {
    private HalloSpring helloSpring;

//  @Autowired
    public HalloControllerConstructor(HalloSpring helloSpring) {
        this.helloSpring = helloSpring;
    }

    public void getMessage(){
        helloSpring.sayHello();
    }
}
