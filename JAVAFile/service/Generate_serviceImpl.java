package Ganerate.JAVAFile.service;

import Ganerate.JAVAFile.utils.the_Utils;

public class Generate_serviceImpl {
	static the_Utils tu = new the_Utils();
	public static String GenerateServiceImpl(String Project,String DuiXiang){
		String LowDuiXiang = tu.firstToLower1(DuiXiang);
		StringBuilder sb = new StringBuilder();
		sb.append("package com."+Project+".service.impl;\n");
		sb.append("import java.util.List;\n");
		sb.append("import org.apache.ibatis.annotations.Param;\n");
		sb.append("import org.springframework.beans.factory.annotation.Autowired;\n");
		sb.append("import org.springframework.stereotype.Service;\n");
		sb.append("import org.springframework.transaction.annotation.Transactional;\n");
		sb.append("\n");
		sb.append("import com."+Project+".dao."+DuiXiang+"Mapper;\n");
		sb.append("import com."+Project+".model."+DuiXiang+";\n");
		sb.append("import com."+Project+".service."+DuiXiang+"Service;\n");
		sb.append("\n");
		sb.append("@Service(\""+DuiXiang+"Service\")\n");
		sb.append("@Transactional\n");
		sb.append("public class "+DuiXiang+"ServiceImpl implements "+DuiXiang+"Service{\n");
		sb.append("\n");
		sb.append("		@Autowired\n");
		sb.append("		private "+DuiXiang+"Mapper "+DuiXiang+"Mapper;\n");
		sb.append("		@Transactional(readOnly=true)\n");
		sb.append("		public List<"+DuiXiang+"> findAll"+DuiXiang+"() {\n");
		sb.append("		return "+DuiXiang+"Mapper.findAll"+DuiXiang+"();\n");
		sb.append("		}\n");
		sb.append("\n");
		sb.append("@Transactional(readOnly=true)\n");
		sb.append("public List<Worker> findAll"+DuiXiang+"By(@Param(value=\"projectWorktypeId\")Integer projectWorktypeId) {\n");
		sb.append("\n");
		sb.append("\n");
		sb.append("\n");
		sb.append("\n");
		sb.append("\n");
		sb.append("\n");
		sb.append("\n");
		return sb.toString();
	}
}
