
public class TestString {

	public static void main(String[] args) {
		int a = 10;//int���� ���� a ���� + �� 10�� a�� ����.
		//  string  ��ü ���� ���
		String str; // Ŭ�� ��Ʈ���� ��ü�� ������ �� �ִ� �����ϴ� ���� ���� (���۷��� ����)
		// String  <<��� Ŭ�� �̸�, a�� ���ú���(Primitive) str�� ��������(reference)
		str = new String("Hello darkness my old friend");//��ü ����
		
		//�޼ҵ� ȣ�� ��� : ��������.�޼ҵ�()
		int len = str.length();//String ��ü�� ����
		System.out.println("string length is = "+ len );
		
		String str1 = str.toUpperCase();
		System.out.println("st1 = "+ str1 );
	}

}
