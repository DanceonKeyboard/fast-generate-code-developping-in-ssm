package Ganerate.JAVAFile.utils;
import java.util.Map;

import org.apache.commons.jexl.JexlContext;
import org.apache.commons.jexl2.JexlEngine;
import org.apache.commons.jexl2.MapContext;  

public class Auto_Utils {

	
	  
	/** 
	 * 动态加载方法 
	 * @author wangyfc 
	 * @throws Exception 
	 * 
	 */  
	
	public static Object invokeMethod(String jexlExp,Map<String,Object> map){  
        JexlEngine jexl=new JexlEngine();  
        org.apache.commons.jexl2.Expression e = jexl.createExpression(jexlExp);  
        JexlContext jc = (JexlContext) new MapContext();  
        for(String key:map.keySet()){  
            ((MapContext) jc).set(key, map.get(key));  
        }  
        if(null==e.evaluate((org.apache.commons.jexl2.JexlContext) jc)){  
            return "";  
        }  
        return e.evaluate((org.apache.commons.jexl2.JexlContext) jc);  
    }  
}
//	public class DyMethodUtil {  
	      
	    
//	}
	
	/*public static Object convertToCode(String jexlExp,Map<String,Object> map) throws Exception{  
        JexlEngine jexl=new JexlEngine();  
        Expression e = (Expression) jexl.createExpression(jexlExp);  
        JexlContext jc = (JexlContext) new MapContext();  
        for(String key:map.keySet()){  
            ((MapContext) jc).set(key, map.get(key));  
        }  
        if(null==e.evaluate(jc)){  
            return "";  
        }  
        return e.evaluate(jc);  
	} */
	  
	    
	    	/*try {
				Map<String,Object> map=new HashMap<String,Object>(); 
				map.put("money",2100);  
				String expression="money>=2000&&money<=4000";  
				Object code = convertToCode(expression,map);
				
				System.out.println(code.toString());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}*/
    

