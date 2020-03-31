package dao;

import org.apache.log4j.Logger;

//version 2
//ICI on simule l'evolution de l'application
// redevelopper l'implementation de l'interface IDoa
public class DaoImplementV2 implements IDao{

	private Logger logger=Logger.getLogger(this.getClass());

	@Override
	public double getTemperature() {
		// TODO Auto-generated method stub
		double t=30;    // simulation d'un acces à un webService qui renvoi 30
		logger.info("temperature: "+t);

		return t  ;
	}

	
}
