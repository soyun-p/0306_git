package work;

import java.util.Scanner;

public class Ex3_work {
	
	public static void main(String[] args) {
		
		// 키보드에서 정수를 두 개 입력받아, 입력받은 두 수의 최소공배수를 구하기.
		// 2와 5를 입력받았다면 10을, 4와 6을 입력받았다면 12, 6과 10을 받았다면 30을, 3과 3을 받았다면 3이 출력.
		
		// 수1 : 4
		// 수2 : 6
		// 최소공배수 : 12
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수1 : ");
		int n1 = sc.nextInt();            // 수1 값 입력
		
		System.out.print("수2 : ");
		int n2 = sc.nextInt();            // 수2 값 입력
		
		
		for(int i = 1; i >= n1 * n2; i++) {  
		// n1*n2이 범위인 것은 n1*n2번 내에서 최소공배수를 구할 수 있기 때문.
			
			if( i % n1 == 0 && i % n2 == 0 ) {  // n1*n2를 
				System.out.println("최소공배수 : " + i);
				break;
				
			} // if : i를 1씩 증가시켜서 n1, n2를 
						
		
		} // for
		
		
	} // main

}
