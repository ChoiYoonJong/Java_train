package mvc.controller;

import mvc.model.vo.Member;

// mvc ���� �� controller ��Ű�� : ����ڰ� ȭ�鿡�� ��û�� �κ��� ó���ϴ� ��� ���
// �̶� ó�� �Ŀ� ����� ���⼭ ����ϴ°� �ƴ϶� ������� �ٽ� view�� ��ȯ�Ͽ� view���� ó���ϵ���

public class MemberController {

	private Member mem = new Member("admin", "1234", "ȫ�浿", "021022-1562334", 163.0);

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
		
		String yearStr = mem.getCitizenNo().substring(0, 2);	// 0��~1�� �ε����� ���ڿ� ����
		int year = Integer.parseInt(yearStr);	

		int age = 0; 
		
		// ���� ���ϴ� ���
		// ����⵵ - (1900 + year) + 1
		// 2019 - (1900 + year) + 1
		

		// 100���̻��� ��� X
		if (year > 20) { // 1900����
			age = 2020 - (1900 + year) + 1;
		} else { // 2000����
			age = 2020 - (2000 + year) + 1;
		}

		return age;
	}

	public void updateHeight(double height) {
		mem.setHeight(height);
	}

}
