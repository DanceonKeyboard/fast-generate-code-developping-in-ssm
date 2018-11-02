package Ganerate.JAVAFile.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.jexl.util.EnumerationIterator;

import Ganerate.JAVAFile.utils.the_Utils;

public class Snippet {
	static the_Utils tu = new the_Utils();
	public static void main(String[] args) {
		BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));  
		System.out.println("请输入字段（空格隔开）：");
		String ziduan="";
		try {
			ziduan = strin.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}  
		//将字段字符串转字符串数组
		String[] ziduan1 =ziduan.split(" ");
	
		//将字符串数组中的每一项首字母小写
		String[] ss = tu.ReplayAndToUpper(ziduan1);
		for (String string : ss) {
			System.out.println(string);
		}
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
			System.out.println("生成成功！"+df.format(new Date()));
		
		System.out.println();
	}
	
	
	public static String getCount(String ss) {
		for (int i = 0; i < ss.length(); i++) {
			char a = ss.charAt(i);
			int index = ss.indexOf("_");
			String ch = null;
			if(a=='_'){
				//ss = ss.setCharAt(2,'k');
				ss=ss.replace(""+ss.charAt(i+1),""+(char)(ss.charAt(i)+32));
			}
		}
		ss=ss.replace("_", "");
		return ss;
	}
	public static String setCharAt(String ss){
		for (int i = 0; i < ss.length(); i++) {
			char a = ss.charAt(i);
			int index = ss.indexOf("_");
			String ch = null;
			if(a=='_'){
				ss=ss.replace(""+ss.charAt(i+1),""+(char)(ss.charAt(i)+32));
			}
		}
		return null;
	}
}

