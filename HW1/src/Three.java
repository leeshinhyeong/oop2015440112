import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		//3. �� ��(������)�� �Է� �޾� ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		int a, b, c ;
		
		Scanner input =new Scanner(System.in); //������ ����
		System.out.print("A�� �Է��ϼ���");
		a = input.nextInt();   // a���ٰ� ����
		System.out.print("B�� �Է��ϼ���");
		b = input.nextInt();   // b���ٰ� ����
		System.out.print("C�� �Է��ϼ���");
		c = input.nextInt();   // c���ٰ� ����
		
			
		if(a>b) {
			if(a>c)
				System.out.println("���� ū ���� A = " +a);}
		if(b>c) {
			if(b>a)
				System.out.println("���� ū ���� B = "+ b);}
		if(c>a) {
			if(c>b)
				System.out.println("���� ū ���� C = " + c);
		}
			
			
			
			
			 

	}

}
