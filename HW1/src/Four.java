import java.util.Scanner;

public class Four {

   public static void main(String[] args) {
	   //����(����)�� �Է� �޾Ƽ� ���(A, B, C, D, E)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
      int score ;
      System.out.print("0~100������ ������ �Է��ϼ���: ");
      Scanner input = new Scanner(System.in); 
      score = input.nextInt();
      
      if (score >= 80) System.out.println("A");
      else if (score >= 60) System.out.println("B");
      else if (score >= 40) System.out.println("C");
      else if (score >= 20) System.out.println("D");
      else System.out.println("F");
   }

}