/*
 * ����
 * 
 */
public class Student {
	
	int id;
	String name;
	int age;
	Computer comp;
	void study(){ 
	System.out.println("��������ѧϰ"+comp.brand);
	}
		void play(){
		
			System.out.println("��Ҫ����Ϸ");
			
			
		
		
	}
		//����ִ�����   ����Ҫ��
		public static void main(String[] args) {
			
			Student Stu = new Student();
			System.out.println(Stu);
			Stu.id=1001;
			Stu.name="����";
			Stu.age=18;
			Stu.play();
			
			
			Computer c1 =new Computer();
			c1.brand="��˶";
			Stu.comp=c1;
			Stu.study();
		}
}
class Computer{
	
	String brand;
}		
	


