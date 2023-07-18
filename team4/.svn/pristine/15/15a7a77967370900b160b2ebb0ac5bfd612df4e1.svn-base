
package service;
/**
 * @함준혁
 * 관리자서비스
 *  1. 매출 확인하기
    2. 상품 등록하기
    3. 재고 관리하기
 */
public interface AdministratorService {
	
	/**@함준혁
	 * isAdmin
	 * : 관리자로그인
	 */
	void isAdmin();
	
	void admin();
	
	/**
	 * @함준혁
	 * find by sales
	 * : 매출을 조회한다. (총매출)
	 * 매출값은 OrderServiceImpl에서 받아옵니다.
	 */
	void checkTotalSales();

	/**
	 * @함준혁 
	 * product register
	 * : 상품을 등록한다. 
	 * 상품을 등록하면 productServiceimpl에 등록됩니다.
	 */
	void register();

	/**
	 * @함준혁
	 * remove
	 * : 상품을 삭제한다.
	 * 상품을 삭제하면 productServiceimpl에 등록된 상품이 삭제됩니다.
	 */
	void remove();

	
	/**
	 * @함준혁
	 * edit
	 * :현재 등록된 회원의 번호를 수정합니다.
	 */
	void edit();


	/**
	 * @함준혁
	 * 관리자 비밀번호를 등록합니다.
	 */
	void pwRegister();
}