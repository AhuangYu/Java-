/*
 * ��������27��Ҳ��˵��
 */
public class TextUser1 {
		int id;
		String name;								//1.1
		String pwd;									//1.1
		static String company="��Ѷ";					//2.2					//3			//4.1
		
		public TextUser1(int id,String name){		//1
			this.id=id;
			this.name=name;
			
		}
		public void login(){
			
			System.out.println("��½��"+name);
			
		}
		public static void printCompany(){				//2					//4
			System.out.println(company);
			
			
		}
		public static void main(String[] args) {
			TextUser1 T=new TextUser1(120,"����");	//1
			TextUser1.printCompany();				//2
			TextUser1.company="������Ѷ";				//3
			TextUser1.printCompany();				//4
		}
		 
}
