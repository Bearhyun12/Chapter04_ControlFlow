package ch04_2_switch;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 85;
		   char grade;
//		   
//		   if (score > 90) {
//			   grade = 'A';
//		   } else if (score >= 80 && score < 90) {
//			   grade = 'B';
//		   } else if (score >= 70 && score < 80) {
//			   grade = 'C';
//		   } else if (score >= 60 && score < 70) {
//			   grade = 'D';
//		   } else {
//			   grade = 'F';
//		   }
//		  
//		   System.out.println(grade);
		   
//		    �� ������ switch������ �ٲ㺸��!!!!!!!!!!!!!!!!!!!!!!!!
		   int month = 3;
		   
		   switch(month) {
		   case 12:
		   case 1: 
		   case 2: 
		       System.out.println("�ܿ� �Դϴ�.");
		       break;
		   case 3:
		   case 4:
		   case 5:
			   System.out.println("�� �Դϴ�.");
			   break;
		   case 6:
		   case 7:
		   case 8:
			   System.out.println("���� �Դϴ�.");
			   break;
		   case 9:
		   case 10:
		   case 11:
			   System.out.println("���� �Դϴ�.");
			   break;
		   
			 
		   }
		
		
	}

}
