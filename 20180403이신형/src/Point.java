
public class Point {
	
	//�ʵ��� scope(��ȿ����)��  Ŭ���� �����̴�.
	private double x; 
	private double y;
	
	
	
	public void setX(double xx) {
		this.x = xx;
		xx = 100;
		
	
	}
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setY(double yy) {
		this.y = yy;
		
	}
	public double distance() {
		//��ȯ�� ���� ����
		double result;
		//�Ÿ� ���
		result = Math.sqrt(x*x+y*y);
		//�Ÿ���ȯ
		return result;//�������� scope �޼ҵ� ����
	}
	
	public Point move(Point p) { //�Ű����� p�� ��ȿ������ �޼ҵ� ����
		//temp ���� ����
		double a;
		double b;
		//point p ��ŭ �̵�
		a = this.x + p.x; //this �� �����ϴ°� field x ���
		b = this.y + p.y;
		//���ο� ����Ʈ ����
		Point pnt = new Point();
		pnt.x = a;
		pnt.y = b;
		
		//���ο� ����Ʈ ��ȯ
		return pnt;
	}

}
