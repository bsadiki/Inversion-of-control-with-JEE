package presentation;

import dao.DaoImpl;
import metier.MetierImpl;


public class MainV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaoImpl dao = new DaoImpl();
		MetierImpl metier= new MetierImpl();
		metier.setDao(dao);
		System.out.println(metier.calcul());
	}

}
