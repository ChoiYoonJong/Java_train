package mvc.run;

import mvc.view.MemberView;

public class Run {
	
	public static void main(String[] args) {
		
		// Run은 단지 실행만 하는 역할을 한다 (스위치 키는 것처럼)
		
		MemberView mv = new MemberView();
		mv.mainMenu();
	}

}
