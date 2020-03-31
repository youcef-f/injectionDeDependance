package presentation;

import dao.DaoImplementV1;
import metier.MetierImplementV1;


public class PresentationIOCInstanciationStaticV1 {

	// ici dans l'instance static on ne peut faire
	// evoluer l'application. Sinon il faut recrire le code pour
	// implementer la version 2.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// injection de dependance IOD par une instanciation static
		// ce n'est pas la meilleur façon de faire. Il faut plutot
		// le faire par une instanciation dynamique des objects
		MetierImplementV1 metier=new MetierImplementV1();
		DaoImplementV1 dao = new DaoImplementV1();
		
		
		
		metier.setDao(dao);
		
		
		System.out.println(metier.calcul());
	}

}
