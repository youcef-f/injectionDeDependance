package presentation;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import metier.IMetier;


// necessite la configuration du fichier ApplicationContext.xml
public class PresentationIOCavecSpringV1etV2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" }) ; 

		IMetier metier= (IMetier) context.getBean("metier");

		System.out.println(metier.calcul());
	
		
		// OU AUTRE FACON DE FAIRE

		
		//BeanFactory bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml")); //
	    
		//IMetier metier2= (IMetier) bf.getBean("metier");

		//System.out.println(metier2.calcul());

				
		
	}

}
