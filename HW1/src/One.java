import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		//. 1두수 정수를 입력받아, 그 중 큰 수를 출력하는 프로그램을 작성하시오.
		int a,b ;
		
		Scanner input =new Scanner(System.in); //다음에 설명
		System.out.print("첫번째 정수를 입력하세요");
		a = input.nextInt();   // a에다가 저장
		System.out.print("두번째 정수를 입력하세요");
		b = input.nextInt();   // b에다가 저장
		
		
		if (a > b) 
			System.out.println("큰수는 " + a);
		else
			System.out.println("큰수는 "+b);
		System.out.println("==============프로그램 종료 ===============");
		
	}

}
