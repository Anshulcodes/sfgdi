package guru.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgdiApplication {

	public static void main(String[] args) {
		 ApplicationContext ac=  SpringApplication.run(SfgdiApplication.class, args);
		 MyController mc=(MyController) ac.getBean("myController");
		 System.out.println(mc.sayHello());
		 
		 System.out.println(" ---- Property ---- ");
		 PropertyInjectedController propertyInjectedController= (PropertyInjectedController) ac.getBean("propertyInjectedController");
		 System.out.println(propertyInjectedController.getGreeting());
		 
		 System.out.println(" ---- Setter ----- ");
		 SetterInjectedController setterInjectedController= (SetterInjectedController) ac.getBean("setterInjectedController");
		 System.out.println(setterInjectedController.getGreeting());
		 
		 System.out.println(" ---- Constructor ---- ");
		 ConstructorInjectedController constructorInjectedController= (ConstructorInjectedController) ac.getBean("constructorInjectedController");
		 System.out.println(constructorInjectedController.getGreeting());
	}

}
