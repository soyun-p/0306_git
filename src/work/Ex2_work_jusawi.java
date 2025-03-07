package work;

public class Ex2_work_jusawi {
	
	public static void main(String[] args) {
		
		// 두 개의 주사위를 던져 합이 5, 6, 7이 되는 경우의 수를 출력.
		
		// 5 : 1 4  2 3  3 2  4 1
		// 6 : 1 5  2 4  3 3  4 2  5 1
		// 7 : 1 6  2 5  3 4  4 3  5 2  6 1
		
		String five = "";
		String six = "";
		String seven = "";
		
		
		for(int i = 1; i <= 6; i++) {
			
			for(int j = 1; j <= 6; j++) {
				
				int res = i + j;
				
				switch( res ) {
				case 5:
					five += i + " " + j + "  ";  // five => (초기 five의 빈 값)i(공백)j( 공백 ) 을 대입.
					break;
					
				case 6:
					six += i + " " + j + "  ";
					break;
					
				case 7:
					seven += i + " " + j + "  ";
					break;
					
				} // switch
					
				
			}  // inner
			
		
			
		} // outer
		
		System.out.println("5 : " + five);
		System.out.println("6 : " + six);
		System.out.println("7 : " + seven);
		
		
		
	} // main

}
