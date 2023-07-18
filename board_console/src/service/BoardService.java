package service;

import vo.Board;

public interface BoardService {
//	회원을 등록한다 (가입) 
	void register();
//	회원정보 수정한다.
	void modify();
//	회원정보를 삭제한다.(탈퇴) 
	void remove();
//	회원은 로그인한다.
	void list();
//	회원정보 상세조회 (단일조회) 
	Board findby(Long bno);
}
