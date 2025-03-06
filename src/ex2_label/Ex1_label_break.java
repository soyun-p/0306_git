package ex2_label;

public class Ex1_label_break {
	
	public static void main(String[] args) {
		
		// label : 특정 반복문의 이름을 지정하여 한 번에 두 개 이상의 반복문을 제어하 수 있도록 하는 기능.
		
		out:for(int i = 1; i <= 2; i++) {  // out : outer for문의 이름
			
			for(int j = 1; j <= 7; j++) {
				
				if( j % 2 == 0 ) {
					break out;  // break문에 반복문 이름을 명시해두면 해당 반복문을 나가게 된다.
					
				}//if 
				
				System.out.print(j + " ");
				
				
			} // inner
			
			System.out.println();
			
			
		} // outer
		
		
	}  // main

}










