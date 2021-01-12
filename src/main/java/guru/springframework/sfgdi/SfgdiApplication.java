package guru.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.I18nController;
import guru.springframework.sfgdi.controllers.PrimaryController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgdiApplication {

	public static void main(String[] args) {
		 ApplicationContext ac=  SpringApplication.run(SfgdiApplication.class, args);
		 
		 System.out.println(" ---- Primary ---- ");
		 PrimaryController mc=(PrimaryController) ac.getBean("primaryController");
		 System.out.println(mc.sayHello());
		 
		 System.out.println(" ---- Profile ---- ");
		 I18nController i18nController= (I18nController) ac.getBean("i18nController");
		 System.out.println(i18nController.sayHello());
		 
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
