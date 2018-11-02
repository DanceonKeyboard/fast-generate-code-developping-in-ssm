package Ganerate.JAVAFile.dao;

import Ganerate.JAVAFile.utils.the_Utils;

public class Generate_Mapper {

	
	/**
	 * 生成对象Mapper接口
	 * @param Project
	 * @param DuiXiang
	 * @return
	 * ByName,及Bywhere等方法未加入
	 */		
	public static String GeneratMapper(String Project,String DuiXiang){
		the_Utils tu = new the_Utils();
		String LowDuiXiang = tu.firstToLower1(DuiXiang);
		StringBuilder sb = new StringBuilder();
		sb.append("package com."+Project+".dao;\n");
		sb.append("import java.util.List;\n");
		sb.append("import com."+Project+".model."+DuiXiang+";\n");
		sb.append("\n");
		sb.append("public interface "+DuiXiang+"Mapper {\n");
		sb.append("\n");
		sb.append("		public List<"+DuiXiang+"> findAll"+DuiXiang+"();\n");
		sb.append("\n");
		sb.append("		public "+DuiXiang+" find"+DuiXiang+"ById(Integer id);\n");
		sb.append("\n");
		sb.append("		public int add"+DuiXiang+"("+DuiXiang+" "+LowDuiXiang+");\n");
		sb.append("\n");
		sb.append("		public int update"+DuiXiang+"ById("+DuiXiang+" "+LowDuiXiang+");\n");
		sb.append("\n");
		sb.append("		public int delete"+DuiXiang+"ById(Integer id);\n");
		sb.append("\n");
		sb.append("}\n");
		return sb.toString();
   }
	
	
}
