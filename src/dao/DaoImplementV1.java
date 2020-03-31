package dao;

import org.apache.log4j.Logger;

//version 1
public class DaoImplementV1 implements IDao{

	private Logger logger=Logger.getLogger(this.getClass());
	
	@Override
	public double getTemperature() {
		// TODO Auto-generated method stub
		double t=24;   // simulation d'un acces DB qui renvoi 24
		logger.info("temperature: "+t);
		return t  ;
	}

	
}
