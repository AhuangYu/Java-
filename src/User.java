
public class User {
	int id;
	String name;
	String pwd;
	public User(){
		
		
		
	}
	public User(int id, String name){
		super();		//���췽����һ������super();
		this.id=id;  //this��ʾ�����õĶ���
		this.name=name;
		
		
	}
	User(int id, String name,String power){
		super();
		this.id=id;
		this.name=name;
		}
	public static void main(String[] args) {
		User u1 = new User();
		User u2 = new User(23,"����");
		User u3 = new User(52,"����","0112");
		System.out.println(u3);
	}

}
