/*
 * ���Ծ�̬��ʼ�����ʹ��
 */
public class User3 {
	int id;
	String name;								//1.1
	String pwd;									//1.1
	static String company ="��Ѷ1";//��˾����	
	
	static{
		System.out.println("ִ����ĳ�ʼ������");
		company = "��Ѷ";		//�ȼ��������ִ�й�����
		printCompany();
		
		
	}
	public static void printCompany(){
		
		System.out.println(company);
		
	}
	public static void main(String[] args) {
		User u3 = null;
	}
	
}

