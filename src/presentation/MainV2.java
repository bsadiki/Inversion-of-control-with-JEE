package presentation;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.IDao;
import metier.IMetier;

public class MainV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scanner=new Scanner(new File("config.txt"));
			String daoClassname=scanner.next();
			String metierClassName=scanner.next();
			Class cdao=Class.forName(daoClassname);
			IDao dao= (IDao) cdao.newInstance();
			Class cmetier=Class.forName(metierClassName);
			IMetier metier=(IMetier) cmetier.newInstance();
			Method meth=cmetier.getMethod("setDao",new Class[]{IDao.class});
			meth.invoke(metier, new Object[]{dao});
			System.out.println(metier.calcul());
			} catch (Exception e) { e.printStackTrace(); }

	}

}
