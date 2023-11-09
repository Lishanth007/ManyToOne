package Mapping.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;
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
		company4.setCompanyName("Meta");

		Companys company5 = new Companys();
		company5.setCompanyId(5);
		company5.setCompanyName("Instagram");

		ArrayList<Companys> List1 = new ArrayList<Companys>();
		List1.add(company1);
		List1.add(company2);
		List1.add(company3);

		ArrayList<Companys> List2 = new ArrayList<Companys>();
		List2.add(company4);
		List2.add(company5);

		Owner owner1 = new Owner();
		owner1.setOwnerId(101);
		owner1.setOwnerName("Elon Musk");
		owner1.setCompanyOwnedBy(List1);

		Owner owner2 = new Owner();
		owner2.setOwnerId(102);
		owner2.setOwnerName("Mark Zuckerberg");
		owner2.setCompanyOwnedBy(List2);

		Configuration configuration = new Configuration().configure().addAnnotatedClass(Companys.class)
				.addAnnotatedClass(Owner.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		List1.forEach(session::save);
		List2.forEach(session::save);
		session.save(owner1);
		session.save(owner2);

		transaction.commit();
	}

}
