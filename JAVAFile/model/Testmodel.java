package Ganerate.JAVAFile.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;

import Ganerate.JAVAFile.utils.the_Utils;

public class Testmodel {
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
	//	String[] ss = tu.firstToLower1(ziduan1);
//		for (String string : ss) {
//			System.out.println(string);
//		}
		String[] rat = tu.ReplayAndToUpper(ziduan1);
		System.out.println(rat[0]);
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
			System.out.println("生成成功！"+df.format(new Date()));
//			
		
		/*String s = "Adfas_bsd";
		String regStr = "_";//查找指定字符并输出下一个字符	
		
		 String str = "asdfghjklxsdfew";
	    int position = s.indexOf("_");
        System.out.println(s.charAt(position+1));
        System.out.println(position);//6
       s = s.substring(0,position)+s.substring(position+1,position+2).toUpperCase()+s.substring(position+1);
       System.out.println(s);
       */
	   // s.replace(s.charAt(position+1), newChar)
        //tu.ReplayAndToUpper(ss);
	        /*for (int i = 0; i < str2.length(); i++) {
	            if (str1.indexOf(str2.charAt(i)) <= -1) {
	                isEquals = false;
	            }
	        }*/
		//正则
		/*
		 
		 String regStr = "_";//查找指定字符
		 Pattern pattern = Pattern.compile(regStr);
		Matcher matcher = pattern.matcher(s);
		boolean result = matcher.find();

		if(result){

		System.out.println("找到QQBrowser字符");

		}else{

		System.out.println("未找到QQBrowser字符");

		}*/
		//查找文件中的字符串
		/* BufferedReader in;
		try {
			in = new BufferedReader(new FileReader("data.txt"));
			String line;
				while((line=in.readLine())!=null){
					System.out.println();
				}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	        
	            /*System.out.println(line); 打印读出的数据*/
		
	}
}
