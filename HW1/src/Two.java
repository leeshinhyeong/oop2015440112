import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		System.out.println("2�� ����");
		//2. �ϳ��� ������ �Է� �޾� �� ���� ¦��(even number)���� Ȧ��(odd number)������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		int a  ;
		Scanner input =new Scanner(System.in); //������ ����
		System.out.print("ù��° ������ �Է��ϼ���");
		a = input.nextInt();   // a���ٰ� ����
		
		
		a = a%2;
		if (a == 0)
		System.out.println("¦���Դϴ�.");
		else 
		System.out.println("Ȧ���Դϴ�.");
		
		System.out.println("=======���α׷� ����========");
		
			
		
		
		

	}

}
