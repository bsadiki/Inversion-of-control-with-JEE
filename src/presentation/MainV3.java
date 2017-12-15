package presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.IMetier;

public class MainV3 {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
		
		IMetier metier=(IMetier) context.getBean("metier");
		System.out.println(metier.calcul());
	}

}
