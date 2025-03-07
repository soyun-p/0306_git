package work;

import java.util.Scanner;

public class Ex1_work_total_limit20 {
	
	public static void main(String[] args) {
		
		// 사용자에게 숫자를 입력받아 1부터 입력받은 수까지의 합을 구하되, 합이 20을 넘으면 반복을 종료.
		
		// 정수 : 5
		// 총합 : 15
		
		// 정수 : 10  
		// 합이 20을 초과하여 반복을 종료합니다.
		// 총합 : 21(20 넘는 가장 첫 번째 숫자) 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 : ");
		int n = sc.nextInt();
		
		int sum = 0;  // 1부터 n까지의 합을 저장할 공간.
		
		for(int i = 1; i <= n; i++) {
			
		    sum += i;	
		    
		    if( sum > 20 ) {
		    	System.out.println("합이 20을 초과하여 반복을 종료합니다.");
		        break;	

		    } // if : 총합이 20을 넘을 때 출력.
		
		} // for
				
		System.out.println("총합 : " + sum);
		
		
	} // main

}
