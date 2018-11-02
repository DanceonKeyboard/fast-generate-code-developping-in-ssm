package Ganerate.JAVAFile.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

import Ganerate.JAVAFile.utils.the_Utils;

public class Generate_xml {
	static the_Utils tu = new the_Utils();
	public static String Generatexml(String Project, String DuiXiang, String[] ziduan,String[] toRepAndUpziduan, String BiaoM) {
		
		String[] Lowziduan = tu.firstToLower1(ziduan);
		StringBuilder sb = new StringBuilder();
		sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		sb.append(
				"<!DOCTYPE mapper PUBLIC \"-//mybatis.org//DTD Mapper 3.0//EN\" \"http://mybatis.org/dtd/mybatis-3-mapper.dtd\" >\n");
		sb.append("<mapper  namespace=\"com." + Project + ".dao." + DuiXiang + "Mapper\">\n");
		sb.append("\n");
		sb.append("<resultMap id=\"" + DuiXiang + "Map\" type=\"com." + Project + ".model." + DuiXiang + "\" >\n");
		
		for (int i = 0; i < Lowziduan.length; i++) {
			sb.append("		<id column=\"" + Lowziduan[i] + "\" property=\"" + toRepAndUpziduan[i] + "\"  />\n");
		}
		sb.append("</resultMap>\n");
		// 查询语句
		sb.append("<select id=\"findAll" + DuiXiang + "\" resultMap=\"" + DuiXiang + "Map\">\n");
		sb.append("select * from " + BiaoM + " where deleted=0\n");
		sb.append("</select>\n");
		sb.append("\n");
		sb.append("</resultMap>\n");
		// 查询语句
		sb.append("<select id=\"find" + DuiXiang + "ById\" resultMap=\"" + DuiXiang + "Map\">\n");
		sb.append("select * from " + BiaoM + " where deleted=0\n");
		sb.append("</select>\n");
		sb.append("\n");
		sb.append("<insert id=\"add" + DuiXiang + "\" parameterType=\"" + DuiXiang + "\" >\n");
		// 生成插入语句
		String InsertSql = CreateInsertSql(BiaoM,DuiXiang, ziduan,toRepAndUpziduan);
		sb.append("	  " + InsertSql + "\n");
		sb.append(" </insert>\n");
		sb.append("\n");
		sb.append("<update id=\"update" + DuiXiang + "ById\" parameterType=\"" + DuiXiang + "\" >\n");
		// 生成更新语句
		String UpdateSql = CreateUpdateSql(BiaoM,DuiXiang, ziduan,toRepAndUpziduan);
		sb.append("    " + UpdateSql + "\n");
		sb.append("</update>\n");
		sb.append("<delete id=\"delete" + DuiXiang + "ById\" parameterType=\"" + DuiXiang + "\" >\n");
		sb.append("update " + BiaoM + "  set  deleted =1  where id = #{" + ziduan[0] + "}\n");
		sb.append("</delete>\n");
		sb.append("</mapper>\n");
		return sb.toString();
	}

	public static String CreateInsertSql(String BiaoM,String DuiXiang, String[] ziduan,String[] toRepAndUpziduan) {
		String[] Lowziduan = tu.firstToLower1(ziduan);
		String sql = "insert into " + BiaoM + " (";
		for (int i = 0; i < Lowziduan.length; i++) {
			sql += Lowziduan[i] + ",";
		}
		sql = sql.substring(0, sql.length() - 1);
		sql += ")  values (";
		for (int i = 0; i < toRepAndUpziduan.length; i++) {
			sql += "#{" + toRepAndUpziduan[i] + "},";
		}
		sql = sql.substring(0, sql.length() - 1);
		sql += ") ";
		return sql;
	}
	//TODO做非空判断
	public static String CreateUpdateSql(String BiaoM,String DuiXiang, String[] ziduan,String[] toRepAndUpziduan) {
		String[] Lowziduan = tu.firstToLower1(ziduan);
		String sql = "update  " + BiaoM + " set \n";
		for (int i = 0; i < Lowziduan.length; i++) {
			sql += Lowziduan[i] + "=#{" + toRepAndUpziduan[i] + "},";
		}
		sql = sql.substring(0, sql.length() - 1);
		sql += " where " + Lowziduan[0] + " = #{" + toRepAndUpziduan[0] + "}";
		return sql;
	}
	
	public static void main(String[] args) {
		/*BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入字段（空格隔开）：");
		String ziduan = "";
		try {
			ziduan = strin.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// System.out.println(str);
		 String[] ziduan1 = ziduan.split(" ");
		 String[] ziduan2 = ziduan.split(" ");
		String[] toRepAndUpziduan = tu.ReplayAndToUpper(ziduan2);
		*/
		BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));  
        System.out.print("请输入项目名和对象名（空格隔开）：");  
        String str="";
		try {
			str = strin.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}  
        //System.out.println(str);
		String[] aa =str.split(" ");
		
		System.out.println("请输入表名（空格隔开）：");
		String BiaoM="";
		try {
			BiaoM = strin.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}  
		System.out.println("请输入字段（空格隔开）：");
		String ziduan="";
		try {
			ziduan = strin.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}  	
        //System.out.println(str);
		String[] ziduan1 =ziduan.split(" ");
		
		 String[] ziduan2 = ziduan.split(" ");
		String[] toRepAndUpziduan = tu.ReplayAndToUpper(ziduan2);
		
		CharSequence  Xml = Generatexml(aa[0],aa[1],ziduan1,toRepAndUpziduan,BiaoM);
		try {
			FileUtils.write(new File("D:\\BaiDuYDownload\\AutoGen_JAVA\\"+aa[1]+"Mapper.xml"), Xml,"UTF-8",true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		System.out.println("生成成功！" + df.format(new Date()));
		String sql = CreateUpdateSql("m_worker_project","Worker", ziduan1,toRepAndUpziduan);
		String sqlinsert = CreateInsertSql("m_worker_project","Worker", ziduan1,toRepAndUpziduan);
		System.out.println(sql);
		System.out.println(sqlinsert);
	}
}
