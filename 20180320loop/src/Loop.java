
public class Loop {

	public static void main(String[] args) {
		//1 ~ 10 ������ ȭ�鿡 ����ϱ� 
		int i;// i�� ��������
		i =1 ;//1. �������� �ʱ�ȭ
		while(i<=10) { //2. ���� ���ǽ�
			System.out.println(i);//3. ������
			i++; // 4. �������� ����
		}
		System.out.println("=========���α׷� ����===============");
		//1~10 ������ ������ �� ���Ѱ� ���
		
		
		int sum; 
		sum = 0; 
		i = 1; //1.�������� �ʱ�ȭ
		while(i<=10) { //2.���� ���ǽ�
			sum = sum + i ; //3.������
			i++; // 4. �������� ��ȭ
			
		}
		System.out.println("sum = " + sum);
		System.out.println("=========���α׷� ����===============");
		
		//for ������ ����
		
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
		System.out.println("���忡�� �߰��� l�� ����" + count);
		
	}

}
