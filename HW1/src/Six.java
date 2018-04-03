import java.util.Scanner;

public class Six {

   public static void main(String[] args) {
	   //어떤 두 자리 수의 자릿수의 순서를 서로 바꾸는 프로그램을 작성하시오.
      int a,b,c,answer;
      System.out.print("두자리 정수를 입력하시오:");
      Scanner input = new Scanner(System.in);
      c = input.nextInt();
      
      a=c%10;
      b=c/10;
      answer=10*a+b;
      System.out.println(answer);
   }

}