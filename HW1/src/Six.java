import java.util.Scanner;

public class Six {

   public static void main(String[] args) {
	   //� �� �ڸ� ���� �ڸ����� ������ ���� �ٲٴ� ���α׷��� �ۼ��Ͻÿ�.
      int a,b,c,answer;
      System.out.print("���ڸ� ������ �Է��Ͻÿ�:");
      Scanner input = new Scanner(System.in);
      c = input.nextInt();
      
      a=c%10;
      b=c/10;
      answer=10*a+b;
      System.out.println(answer);
   }

}