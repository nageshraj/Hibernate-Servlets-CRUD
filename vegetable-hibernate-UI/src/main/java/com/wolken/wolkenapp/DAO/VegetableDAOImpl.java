package com.wolken.wolkenapp.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.wolken.wolkenapp.HibernateUtil;
import com.wolken.wolkenapp.DTO.VegetableDTO;

public class VegetableDAOImpl implements VegetableDAO {

	@Override
	public void addVegetable(VegetableDTO vegetableDTO) {
		// TODO Auto-generated method stub
		// Refer HibernateSingleton.jar for details
		// Configuration configuration = new Configuration();
		// configuration.configure();
		// configuration.addAnnotatedClass(VegetableDTO.class);
		// AddAnnotatedClass isnt used and <mapping> tag is used in web.xml to achieve
		// loose coupling

		// SessionFactory factory = configuration.buildSessionFactory();

		Session session = HibernateUtil.getFactory().openSession();
		Transaction transaction = session.beginTransaction();

		session.save(vegetableDTO);
		transaction.commit();
		session.clear();

	}

	@Override
	public void updateVegetableNameById(int vegetableIdToUpdate, String vegetableNameToBeUpdated) {
		// TODO Auto-generated method stub

		Session session = HibernateUtil.getFactory().openSession();
		Transaction transaction = session.beginTransaction();

		VegetableDTO vegetableDTOToBeUpdated = session.load(VegetableDTO.class, vegetableIdToUpdate);

		vegetableDTOToBeUpdated.setVegetableName(vegetableNameToBeUpdated);

		session.update(vegetableDTOToBeUpdated);
		transaction.commit();
		session.clear();

	}

	@Override
	public void DeleteVegetableById(int vegetableIdToDelete) {
		// TODO Auto-generated method stub

		Session session = HibernateUtil.getFactory().openSession();
		Transaction transaction = session.beginTransaction();

		VegetableDTO vegetableDTOToBeDeleted = session.load(VegetableDTO.class, vegetableIdToDelete);

		session.delete(vegetableDTOToBeDeleted);
		transaction.commit();
		session.clear();

	}

	@Override
	public List<VegetableDTO> getAllVegetable() {
		// TODO Auto-generated method stub

		Session session = HibernateUtil.getFactory().openSession();
		Query query = session.createQuery("from VegetableDTO");
		List<VegetableDTO> vegetableDTOs = query.list();
		// vegetableDTOs.forEach(System.out::print);
		System.out.println(vegetableDTOs);

//		Single Unique retrieval
//		Query query = session.createQuery("select veg from VegetableDTO veg where vegetable_id=1");
//		VegetableDTO dto = (VegetableDTO)query.uniqueResult();
//		System.out.println(vegetableDTOs);
//		
		return vegetableDTOs;
		

	}

}
