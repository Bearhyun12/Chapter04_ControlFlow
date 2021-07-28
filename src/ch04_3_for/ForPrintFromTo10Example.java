package ch04_3_for;

public class ForPrintFromTo10Example {

	public static void main(String[] args) {
//      1+2+3+4+5 = ?
		
		int sum = 0;
		
		int i = 1;
		while(i <= 10) {
			sum += i;
			i++;
			
		}
		
		System.out.println("1~5의 합: " + sum);
//		 초기값 1  -> 조건비교해 -> +1 -> 2 -> 조건비교해 -> 3 ......
		
//		for(int i = 1; i <= 5; i++) {
//			sum += i;	
//		}
//		System.out.println("1~5의 합: " + sum);
//		
        

		}
		
	}


