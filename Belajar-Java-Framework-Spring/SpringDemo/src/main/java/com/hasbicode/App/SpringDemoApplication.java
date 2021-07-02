package com.hasbicode.App;

import com.hasbicode.HalloControllerConstructor;
import com.hasbicode.HelloControllerSetter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:/config/configSpring.xml")

public class SpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);
		HalloControllerConstructor halloControllerConstructor = (HalloControllerConstructor) context.getBean("halloControllerConstructor");
		halloControllerConstructor.getMessage();

		HelloControllerSetter helloControllerSetter = (HelloControllerSetter) context.getBean("helloControllerSetter");
		helloControllerSetter.getMessage();
	}
}
