package training;

public class Test04 {

	public static void main(String[] args) {
//   자연수 1부터 시작.. 모든 홀수를 더해 .. 그리고 그 홀수의 합이 언제(몇을 더했을때)
//		1000을 넘어서는지,  그리고 1000을 넘어선 값은 얼마인지 구해라
//		while문, break문 사용
        
		int sum = 0;
		int num = 1;
		
		
		while(true) {
			// 홀수 조건
			if(num%2 != 0) {
				sum += num;
			}
			// 홀수의 합이  > 1000
			if(sum > 1000) {
				System.out.println(num + " 더할 때 1000을 넘습니다.");
				System.out.println("초과된 값: " + sum);
				break;
			}
			
			num++;
			
		}
		  
	}

}
