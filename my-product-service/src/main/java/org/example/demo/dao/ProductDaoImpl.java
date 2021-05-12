package org.example.demo.dao;

import org.example.demo.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class ProductDaoImpl implements ProductDao{

	private SessionFactory sessionFactory;
	
	@Autowired
	public ProductDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}


	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.save(product);
		return product;
	}

}
