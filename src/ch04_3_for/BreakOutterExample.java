package ch04_3_for;

public class BreakOutterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Escape:for(char upper = 'A'; upper<='Z'; upper++) {
    	  for(char lower='a'; lower<='z'; lower++) {
    		  System.out.println(upper + "-" + lower);
    		  if(lower=='g') {
    			  break Escape;
    		  }
    	  }
      }
	System.out.println("프로그램 실행 종료");
	}
	}


