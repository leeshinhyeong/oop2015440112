
public class TestString {

	public static void main(String[] args) {
		int a = 10;//int형의 변수 a 생성 + 값 10을 a에 저장.
		//  string  객체 생성 방법
		String str; // 클라스 스트링의 객체를 참조할 수 있는 참조하는 참조 변수 (레퍼런스 변수)
		// String  <<얘는 클라스 이름, a는 원시변수(Primitive) str는 참조변수(reference)
		str = new String("Hello darkness my old friend");//객체 생성
		
		//메소드 호출 방법 : 참조변수.메소드()
		int len = str.length();//String 객체의 길이
		System.out.println("string length is = "+ len );
		
		String str1 = str.toUpperCase();
		System.out.println("st1 = "+ str1 );
	}

}
