
public class TextThis {
	int a,b,c;
	
	TextThis(int a,int b){
		this.a=a;
		this.b=b;
		
		
	}
	TextThis(int a,int b,int c){
		
		this(a,b);
		this.c=c;
		
	}
	void sing(){
		
		System.out.println(112);
		
		
		
	}
	void eat(){
		
		this.sing();  //����sing
		System.out.println("�ûؼҳԷ���");
	}	
	
		public static void main(String[] args) {
			
			TextThis hi =new TextThis(2,3);   //newһ������
			hi.eat();						  //����eat
			
			
		}
}
