package service;

import java.util.List;

import vo.Reply;

public interface ReplyService {
//	회원을 등록한다 (가입) 
	void register();
//	회원정보를 삭제한다.(탈퇴) 
	void remove();
//	회원은 로그인한다.
	void list();

	// 글 번호를 토대로 댓글 목록 반환 
	List<Reply> findByBno(Long bno);
}
