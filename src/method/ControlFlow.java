package method;

import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
//	    "�����ε�"
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
		System.out.printf("1.���µ��  2.�Ա�   3.���   4.����\n");
		System.out.println();
	}




	public static int add(int i, int j) {
		return i + j;
	}
		// TODO Auto-generated method stub
	
	
	
	   // ���� add �ε� �ڷ����� �ٸ���. (int , double)
	public static void add(double d, double e) {
		// TODO Auto-generated method stub
		System.out.println(d + e);
	}

	public static void add1(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i + j);
	}
}
