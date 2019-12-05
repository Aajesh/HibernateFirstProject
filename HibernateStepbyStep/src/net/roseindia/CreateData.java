package net.roseindia;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import net.roseindia.model.TestTable;
/**
 * @author Deepak Kumar 
 * Web: http://www.roseindia.net
 */
public class CreateData {
	public static void main(String[] args) throws Exception {

		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		
		System.out.println("========1====");
	/*	Session session = sessFact.getCurrentSession();
		System.out.println("========2====");
		org.hibernate.Transaction tr = session.beginTransaction();
		System.out.println("========3====");*/
		
		Session session=sessFact.openSession(); //creating transaction object
		Transaction t=(Transaction) session.beginTransaction(); 
		TestTable e1=new TestTable (); 
		e1.setId(115); 
		e1.setFirstName("sonoo");
		e1.setLastName("jaiswal"); 
		session.persist(e1);
		//persisting the object 
		t.commit();//transaction is commited 
		session.close();
		System.out.println("successfully saved");

		//Read more: http://mrbool.com/how-to-create-database-table-using-hibernate/28269#ixzz66ykfxy9z
		
		
	/*	Employee emp = new Employee();
		emp.setEmpName("Deepak Kumar");
		emp.setEmpMobileNos("000000");
		emp.setEmpAddress("Delhi - India");
		session.save(emp);
		tr.commit();
		System.out.println("Successfully inserted");
		sessFact.close();*/
	}
}
