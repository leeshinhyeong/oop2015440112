
public class RememberC {

	public static void main(String[] args) {
		//변수 : 메모리 저장 공간의 이름
		//자료형 : 변수가 가질 수 있는 값의범위 / 변수를 피연산자로 사용할 경우, 사용할 수 있는 연산자를정한다/
		//       값을 메모리에 저장하기 위해 필요한 정보(저장공간의 수, 저장 포맷)을 정한다.
		//       int - 2의 31승 ~ 2의 31승 -1 까지 범위
		//변수 선언문 : 사용할 변수의 자료형을 선언한다.
		//          사용할 변수의 자료형을 선언한다.
		//     java에서 변수를 사용하기 전에 반드시 변수선언을 해야 한다.
		int a, b; // 변수 선언문 1: a는 변수의 이름이다. 2.변수 a의 자료형은 int이다.
		
		//리터럴(literal) : 소스코드에서 값을 표현하는 방법
		//연산자 : 연산을 위한 기호
		//대입 연산자(=) : 우변의 값을 좌변의 저장소로 이동한다. 좌변엔 항상 저장소가 있음 우변의 값을 반환한다.
		//수식(expression) : 연산자와 피연산자(리터럴, 변수, 수식)들의 조합. 모든 수식은 값을 반환(리턴) 한다.
		//부수효과(side effect) : 수식이 값을 반환하는 것 이외 수행하는 모든 작업을 부수효과라 한다.
		a = 0x10;
		a = a * 10 + 20 ;	
		// post increment(a++) : 반환값은 a , 부수효과는 a=a+1;
		b = a++;
		System.out.println("a = " + a +  " b = " + b);     // "a = " string(문자열)   + 는 연산자  a는 변수
		// pre increment(++a) : 반환값은 a+1 , 부수효ㅗ과는 a = a + 1
		a = 10;
		b = ++a;
		System.out.println("a = " + a +  " b = " + b);
		
		//java는 부울 자료형과 true/false 리터럴을 사용한다.
		//논리연산자(&& || ! )의 피연산자는  부울 변수 또는 리터럴을 사용해야 한다.
		//관계 연산자는 부울( > < <= == != 등등)은 부울 값을 반환한다
		boolean bb;
		bb = true || false;
		bb = 0<1;
		
		System.out.println("bb = " + bb);
		//java에서 상수를 선언하려면 final 키워드를 사용해야 한다.
		final int c = 180; //final 이 이후로는 c 값을 바꿀 수 없음
		
		//참고 잘못된 변수 이름의 예
		//1 숫자로 시작 // 키워드 // 첫글자가 허용되지 않는 기호ㅓ#		
		System.out.println("c = " + c); 
		
		//소숫점 자료형 (float, double)
		float ff;
		double dd;
		ff = 3.14F;  //F 안붙히면 오류뚬/ 기본적으로 3.14가 더블형 싨구이기 때문에 F 써서 float 형으로 가즈아 그니까 그냥 더블을 씁시다.
		dd = 3.14;   // 리터럴 3.14의 자료형은 double 이다.
		System.out.println("ff = " + ff + " dd = " + dd);
		
		//형 변환(Casting) : 유사한 자료형으로 변환한다
		int x = 10;
		double y = 100.34;
		x = (int)y; // explicit casting  이렇게 케스팅 하면 데이터를 잃을 수 있기 때문에 오류가 난다. 그래서 (int)를 써줘서 정수값으로 변경할 의도를 분명히 해줘야 오류가 안남. 
		//y = x;//implicit casting  알아서 x의 정수값을 더블로 변환해줌  y = (double) x ; 사용해도 됨
		
		System.out.println("x = " + x + "    y = " + y);
				
				
				
				
				
		
		System.out.println("hello" + "there") ; //concatination
		
	}

}
