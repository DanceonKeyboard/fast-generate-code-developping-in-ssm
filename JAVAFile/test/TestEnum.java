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
		System.out.println("�������ֶΣ��ո��������");
		String ziduan="";
		try {
			ziduan = strin.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}  
		//���ֶ��ַ���ת�ַ�������
		ziduan = ziduan.toUpperCase();
		System.out.println(ziduan);
		String[] ziduan1 =ziduan.split(" ");
	
		//���ַ��������е�ÿһ������ĸСд
		//String[] ss = tu.ReplayAndToUpper(ziduan1);
		for (String string : ziduan1) {
			string = TransaferDataType(string);
			System.out.println(string);
			
		}
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
			System.out.println("���ɳɹ���"+df.format(new Date()));
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
//			    System.out.println("����ĵ�һ��Ԫ���� : " + lList.getFirst());  
//			    System.out.println("�������һ��Ԫ���� : " + lList.getLast()); 
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
				System.out.println("������");
				break;
			case CHAR:
				System.out.println("����һ");
				break;
				
			case BLOB:
				System.out.println("���ڶ�");
				break;
				
			case TEXT:
				System.out.println("������");
				break;
				
			case INTEGER:
				System.out.println("������");
				break;
				
			case TINYINT:
				System.out.println("������");
				break;
				
			case SMALLINT:
				System.out.println("������");
				
				break;
				
			default:
				System.out.println("no");
			}
	}
}
