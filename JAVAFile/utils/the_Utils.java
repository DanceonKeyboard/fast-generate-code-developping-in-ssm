package Ganerate.JAVAFile.utils;

public class the_Utils {
	public static String getRegZiduan(String[] ziduan)
	{
		
		return "";
	}
	/**
	 * ���ַ���������ĸ��д
	 * @param s
	 * @return String
	 */
	public static String firstToUpper1(String s){
	    s = s.substring(0,1).toUpperCase()+s.substring(1);
	    return s;
	}
	/**
	 * ���ַ��������ÿһ������ĸ��д
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
	 * ���ַ�������ĸСд
	 * @param s
	 * @return String
	 */
	public static String firstToLower1(String s){
	    s = s.substring(0,1).toLowerCase()+s.substring(1);
	    return s;
	}
	
	/**
	 * ���ַ��������е�ÿһ������ĸСд
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
	 * ����worker_project_id���͵��ַ���
	 * 
	 * @param s
	 * @return ����ȥ_�������һλ��ĸת��д����workerProjectId��
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
	 * �����ַ����ֶ�����
	 * ȥ��_������һλ�ַ�תΪ��д��
	 * @param s
	 * @return �����ַ�������
	 */
	public String[] ReplayAndToUpper(String[] s){
		for (int i = 0; i < s.length; i++) {
			 s[i] =ReplayAndToUpper(s[i]);
		}
		return s;
	}
	/**������
	 * �����ַ���str���ж��ٸ�tag
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
