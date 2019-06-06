/*
 * 
 */
//构造方法名称必须和类名保持一致
class Point{
	double x,y;  //Math不能用ing类型，只能用double或float类型 
	
	
	

	public Point(double a,double b){//x=3.0, y=4.0
		
		x=a;
		y=b;
		
}

		
	public double getDistance(Point t){
		return Math.sqrt((x-t.x)*(x-t.x)+(y-t.y)*(y-t.y));    //Math不能用ing类型，只能用double或float类型
		
	}
}

public class TextConstructor {
	public static void main(String[] args) {
		Point p = new Point(3.0,4.0);
		Point origin = new Point(0.0,0.0);
		
		System.out.println(p.getDistance(origin));//计算两点间距离
	
	}

}
