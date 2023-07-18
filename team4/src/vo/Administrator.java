package vo;

public class Administrator {
	/**
	 * @함준혁
	 * 관리자 비밀번호입니다.
	 */
	private String pw = "1234";

	/**
	 * @함준혁 관리자 비밀번호를 설정하는 메서드입니다.
	 * @param pw
	 */
	public void setPw(String pw) {
		this.pw = pw;
	}

	/**
	 * @함준혁
	 * 관리자 비밀번호를 가져오는 메서드입니다.
	 * @return
	 */
	public String getPw() {
		return pw;
	}
	
}	