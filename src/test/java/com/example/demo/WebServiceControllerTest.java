package com.example.demo;

	
	import org.junit.AfterClass;
import org.junit.Before;

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
//@RunWith(JUnitParamsRunner.class)
@RunWith(SpringRunner.class)
@WebMvcTest(WebServiceController.class)
public class WebServiceControllerTest {

	  @Autowired
	  private MockMvc mvc;

	  @Test
	  public void welcome() throws Exception {
	    mvc.perform(
	    MockMvcRequestBuilders.get("/welcome2")
	   .accept(MediaType.APPLICATION_JSON))
	   .andExpect(MockMvcResultMatchers.status().isOk())
	   .andExpect(MockMvcResultMatchers.content().string(equalTo("Hello world")));
	  }
	  @Test
	  public void checkLoginPass() throws Exception {
		  	
		  mvc.perform(
		    MockMvcRequestBuilders.post("/checkLogin")
 
            .content(buildUrlEncodedFormEntity(
//            		 "b" , "",
                    "username", "Songsakdi", 
                    "password", "1234"
               ))
            .contentType(MediaType.APPLICATION_FORM_URLENCODED) //
		   .accept(MediaType.APPLICATION_JSON))
		    .andExpect(MockMvcResultMatchers.status().isOk())

		    .andExpect(MockMvcResultMatchers.jsonPath("$.user").value("Songsakdi"))
		    .andExpect(MockMvcResultMatchers.jsonPath("$.loginStatus").value("success"));
		  }
	  
	  @Test
	  public void checkLoginFail() throws Exception {
		  	
		  mvc.perform(
		    MockMvcRequestBuilders.post("/checkLogin")
 
            .content(buildUrlEncodedFormEntity(
//            		 "b" , "",
                    "username", "xxxx", 
                    "password", "1234"
               ))
            .contentType(MediaType.APPLICATION_FORM_URLENCODED) //
		   .accept(MediaType.APPLICATION_JSON))
		    .andExpect(MockMvcResultMatchers.status().isOk())

		    .andExpect(MockMvcResultMatchers.jsonPath("$.user").value("xxxx"))
		    .andExpect(MockMvcResultMatchers.jsonPath("$.password").value("1234"))
		    .andExpect(MockMvcResultMatchers.jsonPath("$.loginStatus").value("fail"));
		  }
	  private String buildUrlEncodedFormEntity(String... params) {
		    if( (params.length % 2) > 0 ) {
		       throw new IllegalArgumentException("Need to give an even number of parameters");
		    }
		    StringBuilder result = new StringBuilder();
		    for (int i=0; i<params.length; i+=2) {
		        if( i > 0 ) {
		            result.append('&');
		        }
		        try {
		            result.
		            append(URLEncoder.encode(params[i], StandardCharsets.UTF_8.name())).
		            append('=').
		            append(URLEncoder.encode(params[i+1], StandardCharsets.UTF_8.name()));
		        }
		        catch (UnsupportedEncodingException e) {
		            throw new RuntimeException(e);
		        }
		    }
		    return result.toString();
		 }
	  
	  @AfterClass
	  public static void cleanUp() {
	      // ...
	  }
}



