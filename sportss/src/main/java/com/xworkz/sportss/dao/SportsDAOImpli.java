package com.xworkz.sportss.dao;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.sportss.dto.SportDTO;

public class SportsDAOImpli implements SportsDAO{

	@Override
	public void saveSportss(SportDTO sportDTO) {
		Configuration cfg=new Configuration ();
		cfg.configure();
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(sportDTO);
		transaction.commit();
		
		session.close();
		System.out.println("Sports added");
		
		
	}

	@Override
	public SportDTO getSportsById(int sportsId) {
		Session session=null;
		SportDTO sportsDTO=null;
		
		try {
			Configuration cfg=new Configuration();
			cfg.configure();
			SessionFactory factory=cfg.buildSessionFactory();
			session=factory.openSession();
			sportsDTO =session.get(SportDTO.class,sportsId);
			
		}
		catch(HibernateException e) {
			e.printStackTrace();
		}finally {
			if(session!=null)
				session.close();
		}
		return sportsDTO;
	}
	

	
	}
	
	


