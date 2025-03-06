package ex2_label;

public class Ex2_label_continue {	
	public static void main(String[] args) {
		
		out:for(int i = 1; i <= 2; i++) {
			
			for(int j = 1; j <= 10; j++) {
				
				if( j % 2 == 0 ) {
					continue out;
					
				}  // if
				
				System.out.print(j + " ");
				
			} // inner
			
			System.out.println();
						
		} // out for
		
		// i=1 : j=1, if문 불충족. 1 출력.
		// 이후 j=2 : if문 충족. out for문을 나가고 다시 out for문의 조건식으로 이동.
		// i=2 : j=1, if문 불충족. 1 출력.
		// 이후 다시 j=2 : out for문 나오고 out for문은 범위를 다했기 때문에 프로그램은 끝난다.
		
		
	} // main

}
