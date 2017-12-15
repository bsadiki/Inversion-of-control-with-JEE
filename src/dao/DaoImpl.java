package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository
//@Component
public class DaoImpl implements IDao{

	@Override
	public double[] getData() {
		double[] t = new double[10];
		for(int i = 0; i<10; i++){
			t[i]=Math.random() * ( 1000 - 0 );
		}			
		return t;
	}

}
