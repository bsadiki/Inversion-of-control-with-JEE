package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
//@Component
@Service
public class MetierImpl implements IMetier{
	@Autowired
	@Resource
	private IDao dao;
	@Override
	public double[] getData() {
		// TODO Auto-generated method stub
		return dao.getData();
	}

	@Override
	public double calcul() {
		double[] t1 = dao.getData();
		double moy=0;
		for(int i = 0;i<10 ; i++)
			moy += t1[i];
		return moy/10;
	}

	public IDao getDao() {
		return dao;
	}

	public void setDao(IDao dao) {
		this.dao = dao;
	}

}
