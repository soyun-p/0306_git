package ex1_continue;

public class Ex1_continue {
	
	public static void main(String[] args) {
		
		// continue문 : 반복문 내에서 특정 코드를 건너뛰고자 할 때 사용하는 키워드
		
		for(int i = 1; i <= 2; i++) {
			
			for(int j = 1; j <= 5; j++) {
				
				if( j % 2 == 0 ) {
					continue;    
					// 가까운 for문의 증감식으로 강제 이동.
					// 그러나 항상 증감식으로 건너뛰진 않는다.
					// j가 2의 배수일 때 출력을 건너뛴다.
					// 이 아래에는 어떤 코드도 집어넣을 수 없다.
					
				} // if
				
				System.out.print(j + " ");
				
				
			} // inner
			
			System.out.println();
			
		} // outer
		
		
		System.out.println("----------------------");
		
		
		
		for(int i = 1; i <= 2; i++) {
			
			for(int j =1; j <= 5;) {  
			// 증감식을 ()안이 아니라 {}내부에 쓰는 경우 : inner for문이 아니라 outer for문으로 이동
				
				if( j % 2 == 0) {
					
					// for문에 증감식이 없다면 조건식으로 넘어간다.
					continue;
				}
				
				System.out.println(j + " ");  // 1 출력. 
				
				j++;
				
			} // inner
			
			
		} //outer
		
		// i=1일 때, if문 충족 못하기 때문에 그대로 1출력.
		//  
		
		
		
	}  // main

}
