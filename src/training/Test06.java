package training;

public class Test06 {

	public static void main(String[] args) {
//		�� ���� '���� ���밪' �� ����Ͽ� ����ϴ� �޼ҵ带 
//		�ۼ��ϰ� ���� �ڵ� �ۼ�
//		�޼ҵ� �̸� : abs
//		if else ����ض�
		
		
		
		abs(7, 3);
		abs(-5, -3);
		abs(4, -3);
		
	}

	public static void abs(int i, int j) {
		 if(i > j) {
			System.out.println(i-j);	
		}else {
			System.out.println(j-i);
				
		}
	}
}
