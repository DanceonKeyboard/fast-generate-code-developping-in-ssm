package Ganerate.JAVAFile.service;

import Ganerate.JAVAFile.utils.the_Utils;

public class Generate_service {

	static the_Utils tu = new the_Utils();
	public static String GeneratMapper(String Project,String DuiXiang){
		String LowDuiXiang = tu.firstToLower1(DuiXiang);
		StringBuilder sb = new StringBuilder();
		sb.append("package com."+Project+".dao;\n");
		sb.append("import java.util.List;\n");
		sb.append("import com."+Project+".model."+DuiXiang+";\n");
		sb.append("\n");
		sb.append("public interface "+DuiXiang+"Service {\n");
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
