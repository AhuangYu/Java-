/*class Point{         //Math������ing���ͣ�ֻ����double��float����
	double a,b;
	
	Point(double _a , double _b){  //Math������ing���ͣ�ֻ����double��float����
		a=_a;
		b=_b;
		
	}
	public double getDistance(Point p){
		return Math.sqrt((a-p.a)*(a-p.a)+(b-p.b)*(b-p.b));    //Math������int���ͣ�ֻ����double����
		//��floatҲ����
	}
}

public class TextConstructor1 {
	
		public static void main(String[] args) {
			
			Point p =new Point(1.1,2.2);
			Point origin = new Point(0.1,0.1);
			 //  System.gc();����ϵͳ����
			
			
			System.out.println(p.getDistance(origin));
		

	}
}

*/