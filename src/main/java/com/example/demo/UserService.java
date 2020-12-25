package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class UserService {

	   private static Map<String, User> userRepo = new HashMap<String, User>();
	   static {
		   User user = new User();
		   user.setUsername("Songsakdi");
		   user.setPassword("1234");
//	      userRepo.put(user.getUsername(), user);

//	      Product almond = new Product();
//	      almond.setId("2");
//	      almond.setName("Almond");
//	      productRepo.put(almond.getId(), almond);
	   }
//	   
//	   public User checkLogin(String id) {
//		   
//		   return productRepo.get(id);
//	   }
//	   
//	   public void createProduct(Product product) {
//	      productRepo.put(product.getId(), product);
//	   }
//	  
//	   public void updateProduct(String id, Product product) {
//	      productRepo.remove(id);
//	      product.setId(id);
//	      productRepo.put(id, product);
//	   }
//	   
//	   public void deleteProduct(String id) {
//	      productRepo.remove(id);
//
//	   }
	   
//	   public Collection<Product> getProducts() {
//	      return productRepo.values();
//	   }
	}

