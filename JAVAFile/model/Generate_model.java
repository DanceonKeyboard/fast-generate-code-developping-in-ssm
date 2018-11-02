package Ganerate.JAVAFile.model;

import Ganerate.JAVAFile.utils.the_Utils;

public class Generate_model {


	public static String GeneratModel(String Project,String DuiXiang,String[] ziduan){
		the_Utils tu = new the_Utils();
		//将字段的首字母转换成小写的
		String[] Lowziduan = tu.firstToLower1(ziduan);
		StringBuilder sb = new StringBuilder();
		sb.append("package com."+Project+".model;\n");
		sb.append("\n");
		sb.append("public class "+DuiXiang+" {\n");
		sb.append("\n");
		String[] ziduanAfterReplace = tu.ReplayAndToUpper(Lowziduan);
		sb.append("		 private Integer "+ziduanAfterReplace[0]+";\n");
		for (int i = 1; i < ziduanAfterReplace.length; i++) {

			sb.append("		 private String "+ziduanAfterReplace[i]+";\n");
		}
		/*sb.append("    public Integer getId() {\n");
		sb.append("			return id;\n");
		sb.append("		}\n");
		sb.append("	   public void setId(Integer id) {\n");
		sb.append("			this.id = id;\n");
		sb.append("		}\n");
		
		//将字段的首字母转换成大写的
		String[] Upziduan = firstToUpper1(ziduan);
		for (int i = 1; i < Upziduan.length; i++) {
			sb.append("    public String get"+Upziduan[i]+"() {\n");
			sb.append("			return "+Lowziduan[i]+";\n");
			sb.append("		}\n");
			sb.append("	   public void set"+Upziduan[i]+"(String "+Lowziduan[i]+") {\n");
			sb.append("			this."+Lowziduan[i]+" = "+Lowziduan[i]+";\n");
			sb.append("		}\n");
		}
		sb.append("		public String toString() {\n");
		String GTString = getToString(DuiXiang, Lowziduan);
		sb.append(GTString);
		sb.append("		}\n");
		sb.append("		public User() {");
		sb.append("		}\n");*/
		sb.append("}\n");
		return sb.toString();
   }
	
	public static String getToString(String DuiXiang,String[] ziduanAfterReplace){
		String RET = "return \" ";
		RET+=DuiXiang+"[";
		for (int i = 0; i < ziduanAfterReplace.length; i++) {
			RET+=" "+ziduanAfterReplace[i]+"=\"" + "+"+ziduanAfterReplace[i]+"+\"" + ",";
		}
		RET = RET.substring(0,RET.length() -1);
		RET+="]\";";
		return RET;
	}
	
	
	
}
