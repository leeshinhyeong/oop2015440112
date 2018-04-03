
public class Test {

	public static void main(String[] args) {
		
		Point p;
		p = new Point(); //point 객체 생성 및 레퍼런스 p에 저장
		
		p.x = 1.0;
		p.y = 1.0;
		
		
		System.out.println(p.distance());

	}

}
