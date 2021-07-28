package ch04_3_for;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i<10; i++) {  //각 단 출력
			for(int j=1; j<10; j++) { // 9번 * j++
			System.out.printf("%d X %d = %d\n",
					i, j, i*j);
				
			}System.out.println();
		}
		
		
		
		
		
		
//		for (int m=2; m<=9; m++) {
//			System.out.println("***" + m + "단 ***");
//		for (int n=1; n<=9; n++) {
//			System.out.println(m + " x " + n + " = " + (m*n));
//		}
//		}
	}

}
