package method;

import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
//	    "오버로딩"
//		
		
	    
		showDisplay();
		Scanner scan = new Scanner(System.in);
		
		int i = add(3,5);
		System.out.println(i);
		
	}

        	
	
	
	private static void showDisplay() {
		// TODO Auto-generated method stub
		System.out.println("--------MENU-------");
		System.out.println();
		System.out.printf("1.계좌등록  2.입금   3.출금   4.종료\n");
		System.out.println();
	}




	public static int add(int i, int j) {
		return i + j;
	}
		// TODO Auto-generated method stub
	
	
	
	   // 같은 add 인데 자료형이 다르다. (int , double)
	public static void add(double d, double e) {
		// TODO Auto-generated method stub
		System.out.println(d + e);
	}

	public static void add1(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i + j);
	}
}
