package org.example.demo.service;

import org.example.demo.dao.ProductDao;
import org.example.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
@Service
@EnableTransactionManagement
public class ProductServiceImpl implements ProductService{

	private ProductDao productDao;
	@Autowired
	public ProductServiceImpl(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	@Transactional
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return productDao.createProduct(product);
	}

}
