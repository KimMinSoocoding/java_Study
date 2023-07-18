package service;

public interface OrderService {
	
	/**
	 * @author 이지윤
	 * @since 23/02/11
	 * 
	 * 결제 버튼을 눌렀을 때 가장 먼저 실행
	 */
	void order();

	/**
	 * @author 이지윤
	 * @since 23/02/06 
	 * 
	 * 현금을 입력받는 함수
	 */
	void getCash();
	
	/**
	 * @author 이지윤
	 * @since 23/02/11
	 * 
	 * 음료 개수를 리턴하는 함수
	 */
	int countBeverage();
	
	/**
	 * @author 이지윤
	 * @since 23/02/07
	 * 
	 * 현금에서 상품 합계 금액 차감
	 * 결제 실패 시 false
	 * 결제 성공 시 true 반환
	 */
	boolean payProduct();
	
	/**
	 * @author 이지윤
	 * @since 23/02/06
	 * 
	 * 지금까지 판매한 모든 상품의 총 합(누적합)을 리턴하는 함수
	 */
	int totalSales();
}