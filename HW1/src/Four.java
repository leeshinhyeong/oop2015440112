import java.util.Scanner;

public class Four {

   public static void main(String[] args) {
	   //점수(정수)를 입력 받아서 등급(A, B, C, D, E)을 출력하는 프로그램을 작성하시오.
      int score ;
      System.out.print("0~100사이의 점수를 입력하세요: ");
      Scanner input = new Scanner(System.in); 
      score = input.nextInt();
      
      if (score >= 80) System.out.println("A");
      else if (score >= 60) System.out.println("B");
      else if (score >= 40) System.out.println("C");
      else if (score >= 20) System.out.println("D");
      else System.out.println("F");
   }

}