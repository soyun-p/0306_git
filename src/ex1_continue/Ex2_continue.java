package ex1_continue;

public class Ex2_continue {

	public static void main(String[] args) {

		int n = 1;

		while( n < 5 ) {
			n++;  // n=2부터 시작

			if( n % 3 == 0 ) {
				// while문 안에 있는 continue라면 가까운 while문의 조건식으로 건너뛴다.
				continue;  // ()안에 증감식 없으므로, 조건식으로 넘어간다. 무조건 증감식을 찾아가서 실행하진 않는다.

			} // if

			System.out.println(n);

		} // while



		System.out.println("-------------------");



		int num = 0;

		while( num <= 10 ) {

			num++;

			switch( num ) {
			case 1:
				System.out.println("hi");
				continue;

			case 3:
				System.out.println("hello");
				continue;

			case 5:
				System.out.println("bye");
				continue;



			} // switch

			System.out.println("나는??");  // num이 1, 3, 5가 아닐 때는 switch문을 실행하지 않고,


			// continue 자리에 break가 들어와도 같은 결과를 출력.	그러나 break문을 썼을 때, "나는??"이 2번 출력된다.		
			// 이는 continue문은 switch문 아래의 출력을 실행하지 않고, 다시 while문의 조건식으로 이동하기 때문에 "나는??"이 1번만 출력된다.
			// break문은 switch문 아래의 출력을 실행하고 다시 while문의 조건식으로 이동하기 때문에 "나는??"이 2번 출력된다.


		} // while


	} // main

}
