package Ganerate.JAVAFile.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

import Ganerate.JAVAFile.model.DataTypeReflectEnum;
import Ganerate.JAVAFile.utils.the_Utils;

public class TestEnum {
	static the_Utils tu = new the_Utils();
	public static void main(String[] args) {
		/*BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));  
		System.out.println("请输入字段（空格隔开）：");
		String ziduan="";
		try {
			ziduan = strin.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}  
		//将字段字符串转字符串数组
		ziduan = ziduan.toUpperCase();
		System.out.println(ziduan);
		String[] ziduan1 =ziduan.split(" ");
	
		//将字符串数组中的每一项首字母小写
		//String[] ss = tu.ReplayAndToUpper(ziduan1);
		for (String string : ziduan1) {
			string = TransaferDataType(string);
			System.out.println(string);
			
		}
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
			System.out.println("生成成功！"+df.format(new Date()));
			*/ 
			LinkedList<String> lList = new LinkedList<String>();  
		/*	for (int i = 0; i < ziduan1.length; i++) {
				ziduan1[i] = TransaferDataType(ziduan1[i]);
				lList.add(ziduan1[i]);
			}*/
			    lList.add("1");  
			    lList.add("2");  
			    lList.add("3");  
			    lList.add("4");  
			    lList.add("5");  
			  
			  for (String string : lList) {
				  System.out.println(string);
			}
//			    System.out.println("链表的第一个元素是 : " + lList.getFirst());  
//			    System.out.println("链表最后一个元素是 : " + lList.getLast()); 
	}
	
	
	public static String TransaferDataType(String s){
		String[] sqlDataType = {"VARCHAR","CHAR","BLOB","TEXT","INTEGER","TINYINT","SMALLINT",
				"BIT","BIGINT","FLOAT","DOUBLE","DECIMAL","BOOLEAN","ID","DATE","TIME","DATETIME","TIMESTAMP","YEAR"};
		String[] javaDataType={"String"};
		for (int i = 0; i < sqlDataType.length; i++) {
			if(s.equals(sqlDataType[i])){
				return javaDataType[i];
			}
		}
		return null;
	}
	
	public void SqlDataType(String s){
		
		 DataTypeReflectEnum week=DataTypeReflectEnum.DATE;
			
			switch (week) {
			case VARCHAR:
				System.out.println("星期天");
				break;
			case CHAR:
				System.out.println("星期一");
				break;
				
			case BLOB:
				System.out.println("星期二");
				break;
				
			case TEXT:
				System.out.println("星期三");
				break;
				
			case INTEGER:
				System.out.println("星期四");
				break;
				
			case TINYINT:
				System.out.println("星期五");
				break;
				
			case SMALLINT:
				System.out.println("星期六");
				
				break;
				
			default:
				System.out.println("no");
			}
	}
}
