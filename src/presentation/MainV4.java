package presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import metier.IMetier;

public class MainV4 {

	public static void main(String[] args) {
		ApplicationContext springContext= new AnnotationConfigApplicationContext("dao","metier");
		IMetier metier=springContext.getBean(IMetier.class);
		System.out.println(metier.calcul());
		for (double d:metier.getData()){
			System.out.println(d);
		}
		
	}

}
