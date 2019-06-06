/*
 * 变量，在27集也有说到
 */
public class TextUser1 {
		int id;
		String name;								//1.1
		String pwd;									//1.1
		static String company="亿讯";					//2.2					//3			//4.1
		
		public TextUser1(int id,String name){		//1
			this.id=id;
			this.name=name;
			
		}
		public void login(){
			
			System.out.println("登陆："+name);
			
		}
		public static void printCompany(){				//2					//4
			System.out.println(company);
			
			
		}
		public static void main(String[] args) {
			TextUser1 T=new TextUser1(120,"黄榆");	//1
			TextUser1.printCompany();				//2
			TextUser1.company="海珠亿讯";				//3
			TextUser1.printCompany();				//4
		}
		 
}
