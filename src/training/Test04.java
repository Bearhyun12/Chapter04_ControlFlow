package training;

public class Test04 {

	public static void main(String[] args) {
//   �ڿ��� 1���� ����.. ��� Ȧ���� ���� .. �׸��� �� Ȧ���� ���� ����(���� ��������)
//		1000�� �Ѿ����,  �׸��� 1000�� �Ѿ ���� ������ ���ض�
//		while��, break�� ���
        
		int sum = 0;
		int num = 1;
		
		
		while(true) {
			// Ȧ�� ����
			if(num%2 != 0) {
				sum += num;
			}
			// Ȧ���� ����  > 1000
			if(sum > 1000) {
				System.out.println(num + " ���� �� 1000�� �ѽ��ϴ�.");
				System.out.println("�ʰ��� ��: " + sum);
				break;
			}
			
			num++;
			
		}
		  
	}

}