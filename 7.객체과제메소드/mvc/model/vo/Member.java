package mvc.model.vo;

public class Member {
	
	private String memberId;
	private String memberPwd;
	private String memberName;
	private String citizenNo;
	private double height;
	
	public Member() {
		
	}

	public Member(String memberId, String memberPwd, String memberName, String citizenNo, double height) {
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.citizenNo = citizenNo;
		this.height = height;
	}


	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public void setCitizenNo(String citizenNo) {
		this.citizenNo = citizenNo;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	

	public String getMemberId() {
		return memberId;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public String getMemberName() {
		return memberName;
	}
	public String getCitizenNo() {
		return citizenNo;
	}
	public double getHeight() {
		return height;
	}

	public String information() {
		return "아이디=" + memberId + ", 비밀번호=" + memberPwd + ", 이름=" + memberName
				+ ", 주민번호=" + citizenNo + ", 키=" + height;
	}

}

