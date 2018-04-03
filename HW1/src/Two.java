import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		System.out.println("2번 문제");
		//2. 하나의 정수를 입력 받아 이 수가 짝수(even number)인지 홀수(odd number)인지를 출력하는 프로그램을 작성하시오.
		
		int a  ;
		Scanner input =new Scanner(System.in); //다음에 설명
		System.out.print("첫번째 정수를 입력하세요");
		a = input.nextInt();   // a에다가 저장
		
		
		a = a%2;
		if (a == 0)
		System.out.println("짝수입니다.");
		else 
		System.out.println("홀수입니다.");
		
		System.out.println("=======프로그램 종료========");
		
			
		
		
		

	}

}
