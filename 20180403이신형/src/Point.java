
public class Point {
	public double x;
	public double y;
	public double distance() {
		//��ȯ�� ���� ����
		double result;
		//�Ÿ� ���
		result = Math.sqrt(x*x+y*y);
		//�Ÿ���ȯ
		return result;
	}
	
	public Point move(Point p) {
		//temp ���� ����
		double a;
		double b;
		//point p ��ŭ �̵�
		a = this.x + p.x;
		b = this.y + p.y;
		//���ο� ����Ʈ ����
		Point pnt = new Point();
		pnt.x = a;
		pnt.y = b;
		
		//���ο� ����Ʈ ��ȯ
		return pnt;
	}

}
