
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
		
		this.sing();  //调用sing
		System.out.println("该回家吃饭了");
	}	
	
		public static void main(String[] args) {
			
			TextThis hi =new TextThis(2,3);   //new一个对象
			hi.eat();						  //调用eat
			
			
		}
}
