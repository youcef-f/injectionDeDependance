package presentation;

import dao.DaoImplementV2;
import metier.MetierImplementV2;

// Faire evoluer l'application V1 en V2
public class PresentationIOCInstanciationStaticV2 {

	// ici dans l'instance static on ne peut faire
	// evoluer l'application. Il a fallut recrire le code pour
	// implementer la version 2.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// injection de dependance IOD par une instanciation static
		// ce n'est pas la meilleur façon de faire. Il faut plutot
		// le faire par une instanciation dynamique des objects
		MetierImplementV2 metier=new MetierImplementV2();
		DaoImplementV2 dao = new DaoImplementV2();
		
				
		metier.setDao(dao);
		System.out.println(metier.calcul());
	}

}
