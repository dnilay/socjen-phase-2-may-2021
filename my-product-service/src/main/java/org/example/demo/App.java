package org.example.demo;

import java.util.UUID;

import org.example.demo.model.Address;
import org.example.demo.model.Customer;
import org.example.demo.model.Product;
import org.example.demo.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		/*
		 * Product product=context.getBean(Product.class); product.setProductId(10);
		 * product.setProductName("Cell Phone"); System.out.println(product);
		 */
        ProductService productService=context.getBean(ProductService.class);
        Product product=new Product(101, "Desktop Computer");
        System.out.println(productService.createProduct(product));
        System.out.println("done!!");
        
       
    }
}
