
public class Point {
	public double x;
	public double y;
	public double distance() {
		//반환할 변수 선언
		double result;
		//거리 계산
		result = Math.sqrt(x*x+y*y);
		//거리반환
		return result;
	}
	
	public Point move(Point p) {
		//temp 변수 선언
		double a;
		double b;
		//point p 만큼 이동
		a = this.x + p.x;
		b = this.y + p.y;
		//새로운 포인트 생성
		Point pnt = new Point();
		pnt.x = a;
		pnt.y = b;
		
		//새로운 포인트 반환
		return pnt;
	}

}
