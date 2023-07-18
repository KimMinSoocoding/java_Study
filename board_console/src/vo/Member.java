package vo;

import java.util.Date;
// “회원” (아이디, 비번, 이름, 가입일시)
public class Member {
	private String id;
	private String pw;
	private String name;
	private Date regDate;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	public Member(String id, String pw, String name, Date regDate) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.regDate = regDate;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", regDate=" + regDate + "]";
	}


}
