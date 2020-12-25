package com.example.demo;

	
	import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/// this goes in it's own file
////fields go here
	
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.util.MultiValueMap;

import com.fasterxml.jackson.databind.ObjectMapper;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

@RunWith(SpringRunner.class)
@WebMvcTest(BasicController.class)
public class BasicControllerTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	  @Autowired
	  public MockMvc mvc;
//	  @Autowired private ObjectMapper mapper;
//	  private SomeClass someClass; 
//	  @Before
//	  public void setup() {
//	    someClass = new SomeClass(); 
//	  }
	  @Test
	  public void welcome() throws Exception {
	    mvc.perform(
	    MockMvcRequestBuilders.get("/welcome")
	   .accept(MediaType.APPLICATION_JSON))
	   .andExpect(MockMvcResultMatchers.status().isOk())
	   .andExpect(MockMvcResultMatchers.content().string(equalTo("Hello world")));
	  }
	  
//	  @Test
//	  public void welcomeWithName() throws Exception {
//		    mvc.perform(
//		    MockMvcRequestBuilders.get("/welcome/name/france")
//		   .accept(MediaType.APPLICATION_JSON))
//		   .andExpect(MockMvcResultMatchers.status().isOk())
//		   .andExpect(MockMvcResultMatchers.content().string(equalTo("Hello world "+"france")));
//		  }
	  
//	  @Test
//	  public void checkLogin() throws Exception {
//
//
//		    mvc.perform(
//		    MockMvcRequestBuilders.post("/checkLogin")
// 
//            .content(buildUrlEncodedFormEntity(
//                    "username", "Songsakdi", 
//                    "password", "1234"
//               ))
////            .contentType(MediaType.APPLICATION_FORM_URLENCODED) //
//		   .accept(MediaType.APPLICATION_JSON))
//		    .andExpect(MockMvcResultMatchers.status().isOk())
////		    .andExpect(MockMvcResultMatchers.flash().attribute("loginStatus", "success"));
//		    .andExpect(MockMvcResultMatchers.jsonPath("$.user").value("Songsakdi"))
//		    .andExpect(MockMvcResultMatchers.jsonPath("$.loginStatus").value("success"));
//		  }
//	  private String buildUrlEncodedFormEntity(String... params) {
//		    if( (params.length % 2) > 0 ) {
//		       throw new IllegalArgumentException("Need to give an even number of parameters");
//		    }
//		    StringBuilder result = new StringBuilder();
//		    for (int i=0; i<params.length; i+=2) {
//		        if( i > 0 ) {
//		            result.append('&');
//		        }
//		        try {
//		            result.
//		            append(URLEncoder.encode(params[i], StandardCharsets.UTF_8.name())).
//		            append('=').
//		            append(URLEncoder.encode(params[i+1], StandardCharsets.UTF_8.name()));
//		        }
//		        catch (UnsupportedEncodingException e) {
//		            throw new RuntimeException(e);
//		        }
//		    }
//		    return result.toString();
//		 }
//	  public static String asJsonString(final Object obj) {
//		    try {
//		        final ObjectMapper mapper = new ObjectMapper();
//		        final String jsonContent = mapper.writeValueAsString(obj);
//		        return jsonContent;
//		    } catch (Exception e) {
//		        throw new RuntimeException(e);
//		    }
//		}  
}
//class Body {
//	String username = "Songsakdi";
//	String password = "1234";
//	Body(String username ,String password ){
//		this.username = username;
//		this.password =  password;
//	}
//	
//	String getUsername() {
//		return username;
//	}
//	String getPassword() {
//		return password;
//	}
//}

//public class SomeClass { 	
//	SomeClass( ){
//		this.username = "Songsakdi";
//		this.password = "1234";
//	}
//	String username = "Songsakdi";
//	String password = "1234";
//}


