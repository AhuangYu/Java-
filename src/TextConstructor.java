/*
 * 
 */
//���췽�����Ʊ������������һ��
class Point{
	double x,y;  //Math������ing���ͣ�ֻ����double��float���� 
	
	
	

	public Point(double a,double b){//x=3.0, y=4.0
		
		x=a;
		y=b;
		
}

		
	public double getDistance(Point t){
		return Math.sqrt((x-t.x)*(x-t.x)+(y-t.y)*(y-t.y));    //Math������ing���ͣ�ֻ����double��float����
		
	}
}

public class TextConstructor {
	public static void main(String[] args) {
		Point p = new Point(3.0,4.0);
		Point origin = new Point(0.0,0.0);
		
		System.out.println(p.getDistance(origin));//������������
	
	}

}
