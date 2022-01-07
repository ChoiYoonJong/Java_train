package mvc.controller;

import mvc.model.vo.Member;

// mvc 패턴 중 controller 패키지 : 사용자가 화면에서 요청한 부분을 처리하는 기능 담당
// 이때 처리 후에 결과를 여기서 출력하는게 아니라 결과값을 다시 view에 반환하여 view에서 처리하도록

public class MemberController {

	private Member mem = new Member("admin", "1234", "홍길동", "021022-1562334", 163.0);

	public MemberController() {

	}

	public int login(String memberId, String memberPwd) {
		int result = 0;

		if (mem.getMemberId().equals(memberId) && mem.getMemberPwd().equals(memberPwd)) {
			result = 1;
		}

		return result;
	}

	public Member readInfo() {
		return mem;
	}

	public int readAge() {
		
		String yearStr = mem.getCitizenNo().substring(0, 2);	// 0번~1번 인덱스의 문자열 추출
		int year = Integer.parseInt(yearStr);	

		int age = 0; 
		
		// 나이 구하는 방법
		// 현재년도 - (1900 + year) + 1
		// 2019 - (1900 + year) + 1
		

		// 100살이상은 고려 X
		if (year > 20) { // 1900년대생
			age = 2020 - (1900 + year) + 1;
		} else { // 2000년대생
			age = 2020 - (2000 + year) + 1;
		}

		return age;
	}

	public void updateHeight(double height) {
		mem.setHeight(height);
	}

}
