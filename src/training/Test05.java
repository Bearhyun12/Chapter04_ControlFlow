package training;

public class Test05 {

	public static void main(String[] args) {
//		��� �������� ����ϴ� �޼ҵ带 �����
//		�����ϴ� �ڵ带 �ۼ��Ͻÿ�.
//		ex) divOpr(7,3);
//		�ܼ���� -> "��: 2, ������ 1"
		
//		divOpr(7,3); -> "��: 2, ������ 1"
		
	divOpr(7, 3);
	divOpr(10, 3);
	divOpr(6, 3);
	divOpr(4, 3);
    
	}
  
	private static void divOpr(int i, int j) {
		System.out.printf("��: %d, ������: %d\n", i/j, i%j);
	}
		

}
