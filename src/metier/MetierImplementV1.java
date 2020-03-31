package metier;

import dao.IDao;



//version 1
public class MetierImplementV1 implements IMetier {

	private IDao;

	public void setDao(IDao dao) {
		this.dao = dao;
	}  

	@Override
	public double calcul() {
		// TODO Auto-generated method stub
		double temperature=dao.getTemperature();
		return temperature*2; 
	}


}
