package Ganerate.JAVAFile.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

import Ganerate.JAVAFile.dao.Generate_Mapper;
import Ganerate.JAVAFile.dao.Generate_xml;
import Ganerate.JAVAFile.model.Generate_model;
import Ganerate.JAVAFile.utils.the_Utils;

public class run {
	static the_Utils tu = new the_Utils();
public static void main(String[] args) throws IOException {
		
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
		System.out.println("请输入字段（空格隔开）：");
		String ziduan="";
		try {
			ziduan = strin.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}  
        //System.out.println(str);
		String[] ziduan1 =ziduan.split(" ");
		//TODO解决ziduan1的覆盖问题
		 String[] ziduan2 = ziduan.split(" ");
		String[] toRepAndUpziduan = tu.ReplayAndToUpper(ziduan2);
		System.out.println("请输入表名（空格隔开）：");
		String BiaoM="";
		try {
			BiaoM = strin.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}  
		Generate_model GM = new Generate_model();
		CharSequence  Model = GM.GeneratModel(aa[0],aa[1],ziduan1);
		
		FileUtils.write(new File("D:\\BaiDuYDownload\\AutoGen_JAVA\\"+aa[1]+".java"), Model,"UTF-8",true);
		Generate_Mapper gd = new Generate_Mapper();
		CharSequence  Mapper = gd.GeneratMapper(aa[0],aa[1]);
		FileUtils.write(new File("D:\\BaiDuYDownload\\AutoGen_JAVA\\"+aa[1]+"Mapper.java"), Mapper,"UTF-8",true);
		
		Generate_xml gx = new Generate_xml();
		CharSequence  Xml = gx.Generatexml(aa[0],aa[1],ziduan1,toRepAndUpziduan,BiaoM);
		//FileUtils.write(new File("D:\\BaiDuYDownload\\AutoGen_JAVA\\"+aa[1]+"Mapper.xml"), Xml,"UTF-8",true);
		CharSequence  Service = gd.GeneratMapper(aa[0],aa[1]);
		FileUtils.write(new File("D:\\BaiDuYDownload\\AutoGen_JAVA\\"+aa[1]+"Service.java"), Service,"UTF-8",true);
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		System.out.println("生成成功！"+df.format(new Date()));
		
	}
}
