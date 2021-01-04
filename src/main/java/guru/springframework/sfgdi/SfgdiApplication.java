package guru.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfgdi.controllers.MyController;

@SpringBootApplication
public class SfgdiApplication {

	public static void main(String[] args) {
		 ApplicationContext ac=  SpringApplication.run(SfgdiApplication.class, args);
		 MyController mc=(MyController) ac.getBean("myController");
		 System.out.println(mc.sayHello());
	}

}
