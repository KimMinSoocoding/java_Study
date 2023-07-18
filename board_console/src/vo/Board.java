package vo;

import java.util.Date;

//“ 게시글 “ (글번호, 제목, 내용, 작성자(아이디), 작성일시) 
public class Board {
	private Long bno;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	
	public Board() {
		// TODO Auto-generated constructor stub
	}

	public Board(Long bno, String title, String content, String writer, Date regDate) {
		super();
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regDate = regDate;
	}

	public Long getBno() {
		return bno;
	}

	public void setBno(Long bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regDate="
				+ regDate + "]";
	}
	
	
	
}
