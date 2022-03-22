package com.motivity;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

//import org.hibernate.cfg.Configuration;
//import org.hibernate.classic.Session;


public class MainLogic {
	public static void main(String[] args) {
		//Configuration cf=new Configuration();
		//cf.configure();
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata me=new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf=me.getSessionFactoryBuilder().build();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		
		
		
		/*Query qr=se.createQuery("from Employee e");
		List li=qr.list();
		Iterator itr=li.iterator();
		while(itr.hasNext()) {
			Employee e=(Employee)itr.next();
			System.out.println(e.getEmployee_id()+"    "+e.getEmployee_name()+"    "+e.getMobile()+"    "+e.getAddress());
		}*/
		
		/*Query qr=se.createQuery("select e.employee_name,e.mobile,er.employer_id from Employer er inner join Employee e on er.employer_id=e.employee_id");
		List li=qr.list();
		Iterator itr=li.iterator();
		while(itr.hasNext()) {
			Object[] x=(Object[])itr.next();
			System.out.println(x[0]+"   "+x[1]+"  "+x[2]);
		}
		*/
		
		Query qr=se.createQuery("select e.employee_name,e.mobile,er.employer_id from Employer er inner join Employee e on er.employer_id=");
		List li=qr.list();
		Iterator itr=li.iterator();
		while(itr.hasNext()) {
			Object[] x=(Object[])itr.next();
			System.out.println(x[0]+"   "+x[1]+"  "+x[2]);
		}
		tx.commit();
		se.close();
	}

}