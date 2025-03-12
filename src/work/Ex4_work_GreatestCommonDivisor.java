package work;

import java.util.Scanner;

public class Ex4_work_GreatestCommonDivisor {
	
	public static void main(String[] args) {
		
		// 키보드에서 정수를 두 개 입력받고, 입력받은 두 수의 최대 공약수 구하기
		// 10과 4를 받으면 2를, 12와 18을 받으면 6을, 3과 7을 받으면 "최대공약수가 없습니다." 출력.
		
		// 수1 : 12
		// 수2 : 18
		// 최대공약수 : 6
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수1 : ");
		int n1 = sc.nextInt();
		
		System.out.println("수2 : ");
		int n2 = sc.nextInt();
		
	
		
		// n1이 반드시 작은 수가 되도록 한다.
		if( n1 > n2 ) {
			int n3 = n1;
			n1 = n2;
			n2 = n3;
		}
		
		int i = 0; // i를 전역 변수로 초기화(힌트)
		     
		
		for(i = n1; i >= 2; i--) { // 범위 : 2 ~ n1까지를 n1, n2에 나눠보기
			
			if( n1 % i  == 0 && n2 % i == 0 ) {  
				break;
				
			} // if
				
			
			
		} // for
		
		if( i == 1 ) { 
			// 최대공약수가 없다는 것은 서로소라는 것. 
			// 서로소는 공통으로 나누어지는 수가 1뿐이므로 i(공통으로 나누어지는 수)=1 이면 최대공약수가 없는 것이다.
			System.out.println("최대공약수가 없습니다.");
			
		} // if
		
		System.out.println("최대공약수 : " + i);
		
	} // main

}
