
public class TestString {

	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		System.out.println(str1.equals(str2));
		//주소의 내용을 비교하고 싶으면 이 함수를 써야한더
		str1 = str2;
		//str2의 주소를 str1에 반환해서 아래것도  true로 바뀜
		//str1주소에 있는 값은 garbage 고 jvm이 garbage collection
		System.out.println(str1 == str2);
		//false를 리턴
		//str1 안의 주소 str2 안의 주소 끼리 비교한 것이라서 false


	}

}
