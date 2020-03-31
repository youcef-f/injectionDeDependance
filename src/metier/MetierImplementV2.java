package metier;

import dao.IDao;

// version 2
// ICI on simule l'evolution de l'application
//redevelopper l'implementation de l'interface IMedia

public class MetierImplementV2 implements IMetier {

	private IDao dao;

	public void setDao(IDao dao) {
		this.dao = dao;
	}  

	@Override
	public double calcul() {
		// TODO Auto-generated method stub
		double temperature=dao.getTemperature();
		return temperature*3.5;  // la Version 2 change le taux
	}
	


}
