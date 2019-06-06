
public class User4 {
	int id;
	String name;								//1.1
	String pwd;									//1.1
	static String company ="亿讯1";//公司名称	
	
	
	public User4(int id,String name){
		this.id =id;
		this.name = name;
		
		
	}
	
	
	
	public  void textparameterTransfer01(User4 u){
		
		u.name="黄榆";
		
//		System.out.println(company);
		
	}

	public  void textparameterTransfer02(User4 u){
		
		u = new User4(200,"黄榆啊");
		
//		System.out.println(company);
		
	}
//	public static void printCompany(User4 u)  {
//		
//		System.out.println(company);
//		
//	}
	
	public static void main(String[] args) {
		User4 u1 =new User4(110,"黄榆1");
		u1.textparameterTransfer01(u1);
		System.out.println(u1.name);
		u1.textparameterTransfer02(u1);
		System.out.println(u1.name);
		
	}
	
}

