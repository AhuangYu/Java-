
public class User {
	int id;
	String name;
	String pwd;
	public User(){
		
		
		
	}
	public User(int id, String name){
		super();		//构造方法第一句总是super();
		this.id=id;  //this表示创建好的对象
		this.name=name;
		
		
	}
	User(int id, String name,String power){
		super();
		this.id=id;
		this.name=name;
		}
	public static void main(String[] args) {
		User u1 = new User();
		User u2 = new User(23,"黄榆");
		User u3 = new User(52,"黄榆","0112");
		System.out.println(u3);
	}

}
