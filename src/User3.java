/*
 * 测试静态初始化块的使用
 */
public class User3 {
	int id;
	String name;								//1.1
	String pwd;									//1.1
	static String company ="亿讯1";//公司名称	
	
	static{
		System.out.println("执行类的初始化工作");
		company = "亿讯";		//先加载类才能执行构造器
		printCompany();
		
		
	}
	public static void printCompany(){
		
		System.out.println(company);
		
	}
	public static void main(String[] args) {
		User u3 = null;
	}
	
}

