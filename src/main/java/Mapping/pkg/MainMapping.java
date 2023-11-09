package Mapping.pkg;

import java.util.Arrays;
import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainMapping {

	public static void main(String[] args) {
		Companys company1 = new Companys();
		company1.setCompanyId(1);
		company1.setCompanyName("Tesla");

		Companys company2 = new Companys();
		company2.setCompanyId(2);
		company2.setCompanyName("SpaceX");

		Companys company3 = new Companys();
		company3.setCompanyId(3);
		company3.setCompanyName("Neuralink");

		Companys company4 = new Companys();
		company4.setCompanyId(4);
		company4.setCompanyName("xAI");

		Companys company5 = new Companys();
		company5.setCompanyId(5);
		company5.setCompanyName("Twitter or X");

		Owner owner1 = new Owner();
		owner1.setOwnerId(101);
		owner1.setOwnerName("Elon Musk");
		
		for (Companys companys : Arrays.asList(company1,company2,company3,company4,company5)) {
			companys.setCompanyOwner(owner1);
		}
		
//		company1.setCompanyOwner(owner1);
//		company2.setCompanyOwner(owner1);
//		company3.setCompanyOwner(owner1);
//		company4.setCompanyOwner(owner1);
//		company5.setCompanyOwner(owner1);
		
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Companys.class)
				.addAnnotatedClass(Owner.class);
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.save(company1);
		session.save(company2);
		session.save(company3);
		session.save(company4);
		session.save(company5);
		session.save(owner1);
		
		transaction.commit();
	}

}
