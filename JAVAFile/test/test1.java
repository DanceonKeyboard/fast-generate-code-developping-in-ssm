package Ganerate.JAVAFile.test;

import java.util.HashMap;
import java.util.Map;

import Ganerate.JAVAFile.utils.Auto_Utils;

public class test1 {

	public static void main(String[] args) {
	    	Map<String,Object> map=new HashMap<String,Object>(); 
	    	String testService = "test1";
	    	
	    	map.put("testService",testService);  
	    	map.put("person","tt");  
	    	String expression="testService.save(person)";  
	    	Auto_Utils au = new Auto_Utils();
	    	//au.invokeMethod.invokeMethod(expression,map); 
	    	System.out.println("haha");
	}
}
