package vo;

import java.util.Date;
//“댓글” (댓글번호, 내용, 작성일시, 작성자, 글번호)
public class Reply {
	private Long rno;
	private String content;
	private Date regDate;
	private String writer;
	private Long bno;
	
	public Reply() {
		// TODO Auto-generated constructor stub
	}

	public Reply(Long rno, String content, Date regDate, String writer, Long bno) {
		super();
		this.rno = rno;
		this.content = content;
		this.regDate = regDate;
		this.writer = writer;
		this.bno = bno;
	}

	public Long getRno() {
		return rno;
	}

	public void setRno(Long rno) {
		this.rno = rno;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Long getBno() {
		return bno;
	}

	public void setBno(Long bno) {
		this.bno = bno;
	}

	@Override
	public String toString() {
		return "Reply [rno=" + rno + ", content=" + content + ", regDate=" + regDate + ", writer=" + writer + ", bno="
				+ bno + "]";
	}
	
	
}
