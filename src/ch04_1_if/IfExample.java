package ch04_1_if;

public class IfExample {
   public static void main(String[] args) {

	   int score = 75;
	   char grade = 0 ;
//	   char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
//	       위의 삼항연산을 if-else 구문으로 똑같이 표현한거임.
	   if (score > 90) {
		   grade = 'A';
	   } else if (score >= 80 && score < 90) {
		   grade = 'B';
	   } else if (score >= 70 && score < 80) {
		   grade = 'C';
	   } else if (score >= 60 && score < 70) {
		   grade = 'D';
	   } else {
		   grade = 'F';
	   }
	   // (D까지만 있는상황)예를들어 score 가 50 이면 아예밖으로 나가 값이 할당이 안되버린다.
	     // 그래서  grade 값을 할당해줘야한다.
	   // 그래서 마지막에 else 나머지는 f 다 넣어준것.
	   System.out.println(grade);
	}
 }

