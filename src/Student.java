/*
 * 对象
 * 
 */
public class Student {
	
	int id;
	String name;
	int age;
	Computer comp;
	void study(){ 
	System.out.println("我在认真学习"+comp.brand);
	}
		void play(){
		
			System.out.println("我要玩游戏");
			
			
		
		
	}
		//程序执行入口   必须要有
		public static void main(String[] args) {
			
			Student Stu = new Student();
			System.out.println(Stu);
			Stu.id=1001;
			Stu.name="黄榆";
			Stu.age=18;
			Stu.play();
			
			
			Computer c1 =new Computer();
			c1.brand="华硕";
			Stu.comp=c1;
			Stu.study();
		}
}
class Computer{
	
	String brand;
}		
	


