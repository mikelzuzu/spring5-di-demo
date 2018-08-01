package com.mikelzuzu;

import com.mikelzuzu.controllers.ConstructorInjectedController;
import com.mikelzuzu.controllers.MyController;
import com.mikelzuzu.controllers.PropertyInjectedController;
import com.mikelzuzu.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		//String print = controller.hello();

		//System.out.println(print);

		System.out.println("Using controllers");
		System.out.println(controller.hello());

		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());

		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());

		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
