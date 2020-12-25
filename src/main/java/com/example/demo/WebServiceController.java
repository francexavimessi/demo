package com.example.demo;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WebServiceController {
	@GetMapping("welcome2")
	public String welcome() {
		return "Hello world";
	}
 
   @RequestMapping(value = "/checkLogin", method = RequestMethod.POST)
   public ResponseEntity<HashMap<String, String>> user(@RequestBody String b,String username , String password) {
	   User user = new User();
	   user.setUsername("Songsakdi");
	   user.setPassword("1234");
	   HashMap<String, String> map = new HashMap<>();
	   if(username.equals(user.getUsername())&& password.equals(user.getPassword())) {
		   
		    map.put("user", username);
		    map.put("loginStatus", "success");

	   }else {
		   map.put("user", username);
		    map.put("password", password);
		    map.put("loginStatus", "fail");
	   }
	   
//	   personJsonObject = new JSONObject();
//      productService.createProduct(product);
      return new ResponseEntity<>( map , HttpStatus.OK);
   }
}