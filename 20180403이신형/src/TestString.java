
public class TestString {

	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		System.out.println(str1.equals(str2));
		//�ּ��� ������ ���ϰ� ������ �� �Լ��� ����Ѵ�
		str1 = str2;
		//str2�� �ּҸ� str1�� ��ȯ�ؼ� �Ʒ��͵�  true�� �ٲ�
		//str1�ּҿ� �ִ� ���� garbage �� jvm�� garbage collection
		System.out.println(str1 == str2);
		//false�� ����
		//str1 ���� �ּ� str2 ���� �ּ� ���� ���� ���̶� false


	}

}
