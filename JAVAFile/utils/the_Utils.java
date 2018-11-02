package Ganerate.JAVAFile.utils;

public class the_Utils {
	public static String getRegZiduan(String[] ziduan)
	{
		
		return "";
	}
	/**
	 * 将字符串的首字母大写
	 * @param s
	 * @return String
	 */
	public static String firstToUpper1(String s){
	    s = s.substring(0,1).toUpperCase()+s.substring(1);
	    return s;
	}
	/**
	 * 将字符串数组的每一项首字母大写
	 * @param s
	 * @return String[]
	 */
	public static String[] firstToUpper1(String[] s){
		for (int i = 0; i < s.length; i++) {
			s[i] = firstToUpper1(s[i]);
		}
	    return s;
	}
	/**
	 * 将字符串首字母小写
	 * @param s
	 * @return String
	 */
	public static String firstToLower1(String s){
	    s = s.substring(0,1).toLowerCase()+s.substring(1);
	    return s;
	}
	
	/**
	 * 将字符串数组中的每一项首字母小写
	 * @param s
	 * @return
	 */
	public static String[] firstToLower1(String[] s){
		for (int i = 0; i < s.length; i++) {
			s[i] = firstToLower1(s[i]);
		}
	    return s;
	}
	
	/*public String[] ReplayAndToUpper(String[] s){
		for (int i = 0; i < s.length; i++) {
			 int position = s[i].indexOf("_");
		       s[i] =s[i].substring(0,position)+s[i].substring(position+1,position+2).toUpperCase()+s[i].substring(position+1);
		}
		return s;
	}*/
	
	/**
	 * 传入worker_project_id类型的字符串
	 * 
	 * @param s
	 * @return 返回去_并将其后一位字母转大写（即workerProjectId）
	 */
	public String ReplayAndToUpper(String s){
		if(s.indexOf("_")!=-1){
		String[] ss1 =s.split("_");
		String as=ss1[0];
		for (int i = 1; i < ss1.length; i++) {
			
			as+= firstToUpper1(ss1[i]);
		}
		return as;
		}else{
			return s;
		}
	}
	/**
	 * 传入字符串字段数组
	 * 去掉_并将下一位字符转为大写的
	 * @param s
	 * @return 返回字符串数组
	 */
	public String[] ReplayAndToUpper(String[] s){
		for (int i = 0; i < s.length; i++) {
			 s[i] =ReplayAndToUpper(s[i]);
		}
		return s;
	}
	/**计数器
	 * 计算字符串str中有多少个tag
	 * @param str
	 * @param tag
	 * @return
	 */
	public static int getCount(String str, String tag) {
		int index = 0;
		int count = 0;	   
		 while ((index = str.indexOf(tag)) != -1 ) {
			 //String str1 = str.substring(0, index);
//			 str1 = str.replace(str.valueOf(index+1), (str.charAt(index+1)+32));
			 str = str.substring(index + tag.length()); 
			 System.out.println(index);
			 count++;
		}
		return count;
	}
}
