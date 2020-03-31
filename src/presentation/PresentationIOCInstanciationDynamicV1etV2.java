package presentation;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.IDao;
import metier.IMetier;


// avec l'instance dynamic on est capable de de choisir au demarrage
// de l'application quelle version instancier des objects. Ainsi l'application
// main reste inchanger. Le seul changement a faire est de modifier le fichier
// configDynamicInstanciation.txt
public class PresentationIOCInstanciationDynamicV1etV2 {

	public static void main(String[] args) {
		try {
			Scanner  scanner=new Scanner(new File("configDynamicInstanciation.txt"));
			
			// instanciation dynamique d'une objet dao. 
			// Lecture depuis un fichier
			// puis creer un object dao
			// equivalent en statique à
			//  DaoImplementV1 dao = new DaoImplementV1();
			String daoClassName =  scanner.next();
			System.out.println("daoClassName: "+ daoClassName );
			Class cDao = Class.forName(daoClassName);		
			IDao dao=(IDao) cDao.newInstance();
			System.out.println(dao.getTemperature());
			
			// instanciation dynamique d'une objet metier. 
			// Lecture depuis un fichier
			// puis creer un object metier
			// equivalent en statique à 
			//     MetierImplementV1 metier=new MetierImplementV1();
			String MetierClassName = scanner.next();
			System.out.println("MetierClassName: "+ MetierClassName );
			Class cMetier = Class.forName(MetierClassName);
			IMetier metier= (IMetier) cMetier.newInstance();
			
			
            // use methode equivalent à satique:  
			//   metier.setDao(dao);
			Method m = cMetier.getMethod("setDao", new Class[] {IDao.class});
			m.invoke(metier,new Object[] {dao} ) ;
			
			
			System.out.println(metier.calcul());
			
			

		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
