import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		//. 1�μ� ������ �Է¹޾�, �� �� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int a,b ;
		
		Scanner input =new Scanner(System.in); //������ ����
		System.out.print("ù��° ������ �Է��ϼ���");
		a = input.nextInt();   // a���ٰ� ����
		System.out.print("�ι�° ������ �Է��ϼ���");
		b = input.nextInt();   // b���ٰ� ����
		
		
		if (a > b) 
			System.out.println("ū���� " + a);
		else
			System.out.println("ū���� "+b);
		System.out.println("==============���α׷� ���� ===============");
		
	}

}
