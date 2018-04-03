import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		//3. 세 수(정수형)를 입력 받아 가장 큰 수를 출력하는 프로그램을 작성하시오.
		
		int a, b, c ;
		
		Scanner input =new Scanner(System.in); //다음에 설명
		System.out.print("A를 입력하세요");
		a = input.nextInt();   // a에다가 저장
		System.out.print("B를 입력하세요");
		b = input.nextInt();   // b에다가 저장
		System.out.print("C를 입력하세요");
		c = input.nextInt();   // c에다가 저장
		
			
		if(a>b) {
			if(a>c)
				System.out.println("가장 큰 수는 A = " +a);}
		if(b>c) {
			if(b>a)
				System.out.println("가장 큰 수는 B = "+ b);}
		if(c>a) {
			if(c>b)
				System.out.println("가장 큰 수는 C = " + c);
		}
			
			
			
			
			 

	}

}
