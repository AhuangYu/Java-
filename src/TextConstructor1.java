/*class Point{         //Math不能用ing类型，只能用double或float类型
	double a,b;
	
	Point(double _a , double _b){  //Math不能用ing类型，只能用double或float类型
		a=_a;
		b=_b;
		
	}
	public double getDistance(Point p){
		return Math.sqrt((a-p.a)*(a-p.a)+(b-p.b)*(b-p.b));    //Math不能用int类型，只能用double类型
		//用float也报错
	}
}

public class TextConstructor1 {
	
		public static void main(String[] args) {
			
			Point p =new Point(1.1,2.2);
			Point origin = new Point(0.1,0.1);
			 //  System.gc();建议系统调用
			
			
			System.out.println(p.getDistance(origin));
		

	}
}

*/