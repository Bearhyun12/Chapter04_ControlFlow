package ch04_3_for;

public class KukudanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
//		for(int i=1; i<=9; i++) {
//			for(int j=1; j<=9; j++){
//					System.out.printf("%d * %d = %d\t", j, i, i*j);
//		}
//			System.out.println();
//			
//		}
		
		
		
		
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=i; j++) {
					
				System.out.print("*");
				if(i == j) {
					System.out.println();
			}
		}
			
		}
		
	}
}
	
