package training;

public class Test03 {

	public static void main(String[] args) {
//      1000 ���� �ڿ��� (0����x) �߿��� 2�� ��� ���� 7�� ����� ���� ���,
//		�� ������ ������ ���...
//		while �� �̿�
		
	   int num =1;
	   int sum = 0;
	   while(num <= 1000) {
		   num++;
		   if((num%2) ==0 && (num%7) == 0) {
			   System.out.println(num);
			   sum += num;
	   }
	   } System.out.println("����: " + sum);
		
		
			
		
		
//		int num = 1;
//		int sum = 0;
//		
//		while(num <= 1000) {
//			if((num % 2) == 0 && (num % 7) == 0) {
//				System.out.println(num);
//			    sum += num;	
//			}
//			num++;
//		}
//		
//		System.out.println("������: " + sum );
		
		
		
	}

}