
public class Loop {

	public static void main(String[] args) {
		//1 ~ 10 정수를 화면에 출력하깅 
		int i;// i는 루프변수
		i =1 ;//1. 루프변수 초기화
		while(i<=10) { //2. 루프 조건식
			System.out.println(i);//3. 루프문
			i++; // 4. 루프변수 변형
		}
		System.out.println("=========프로그램 종료===============");
		//1~10 까지의 정수를 다 더한것 출력
		
		
		int sum; 
		sum = 0; 
		i = 1; //1.루프변수 초기화
		while(i<=10) { //2.루프 조건식
			sum = sum + i ; //3.루프문
			i++; // 4. 루프변수 변화
			
		}
		System.out.println("sum = " + sum);
		System.out.println("=========프로그램 종료===============");
		
		//for 문으로 쓴거
		
		for(i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		String str = "hello darkness my old friend";
		int count = 0;
		for (i=0; i < str.length(); i++) {
			if(str.charAt(i) != 'l')
				continue;
			count++;
		}
		System.out.println("문장에서 발견한 l의 갯수" + count);
		
	}

}
