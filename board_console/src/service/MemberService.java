package service;

import vo.Member;

public interface MemberService {
	
//	회원을 등록한다 (가입) 
	void register();
//	회원정보 상세조회 (단일조회) 
	Member findby();
//	회원정보 수정한다.
	void modify();
//	회원정보를 삭제한다.(탈퇴) 
	void remove();
//	회원은 로그인한다.
	void login();

}
