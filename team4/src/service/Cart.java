

package service;

import java.awt.Menu;
import java.util.ArrayList;
import java.util.List;

import main.KioskMain;
//import main.KioskMain;
import util.RangeException;
import util.Utils;
import vo.ProductVO;

public class Cart {


	/**
	 * 김민수 
	 * 카트 리스트 
	 * 상품 추가 
	 * 상품 삭제 
	 * 금액합산 
	 *
	 */
	
	
	public int checkRange(int code) {
		for(int i=0; i<productService.getProCategory().size(); i++ ) {
			if(productService.getProCategory().get(i).getProNum() == code) {
				return code;
			}
		}
		throw new util.RangeException(code);
	 }
	
	// 카트 싱글톤 구현 
	private static Cart cart = new Cart();
	public static Cart getInstance() {
		return cart;
	}
	private Cart() {}
	
	// 리스트 싱글톤 구현
	List<ProductVO> pickList = new ArrayList<ProductVO>();
	
	public List<ProductVO> getPickList() {
		return pickList;
	}
	
	// ProductServiceImpl 싱글톤 호출
	ProductService productService = ProductServiceImpl.getInstance();
	// main 싱글톤 호출 
	 KioskMain main = KioskMain.getInstance();
	
	// 장바구니 음료리스트 
	public void showList() {
//		pickList.forEach(System.out::println); // 음료리스트 보여주는 코드
//		System.out.println(pickList);
		for(int i=0; i<pickList.size(); i++) {
			System.out.println(pickList.get(i).toStringCnt());
		}
	}
	
	// 금액합계
	public int totalPrice() {
		int sum=0;
		for(int i = 0; i<pickList.size(); i++) {
			sum += pickList.get(i).getProPrice() * pickList.get(i).getCnt();
		}
		return sum;
		
	}
	// 상품갯수 
	public int totalPro() {
		int sum=0;
		for(int i = 0; i<pickList.size(); i++) {
			sum += pickList.get(i).getCnt();
		} 
		return sum;
	}
	
	// 장바구니 리스트
	public void proList() {
		OrderService orderService = OrderServiceImpl.getInstance();
		System.out.println();
		System.out.println(" === 장바구니 목록 ===");
		showList();	// 음료리스트 보여주는 코드
		System.out.println();
		System.out.println("총 금액 : " + totalPrice() + "원");
		System.out.println("총 상품갯수 : " + totalPro());
		System.out.println();
		int input = productService.checkRange(Utils.nextInt("1.상품추가  2.상품삭제  3.결제하기"),1,3);
		switch(input) {
		case 1: 
			main.run();
//			addProduct();
			break;
		case 2:
			proDelete();
			break;
		case 3:
			orderService.order();
			break;
		}
	}
	
	public void setCnt() {
		for(int i=0; i<productService.getProCategory().size(); i++) {
			productService.getProCategory().get(i).setCnt(1);
		}
	}
	
	// 장바구니에 추가 
	public void addProduct() {
			int code = checkRange(Utils.nextInt("주문할 메뉴의 상품 코드를 입력해주세요 > "));
			if(cart.findBy(code) != null) {
				cart.findBy(code).increaseCnt();
				System.out.println(findBy(code).getProName() + "담기 완료");
			}else {
			for(int i = 0; i < productService.getProCategory().size(); i++) {
					if(productService.getProCategory().get(i).getProNum() == code) {
						pickList.add(productService.getProCategory().get(i));
						System.out.println(productService.getProCategory().get(i).getProName() + " 담기 완료");
						main.run();
					}
				}
			}
	    }
		
	
	//상품 삭제하기
	public void proDelete() {
		showList();
		if(pickList.isEmpty()) {
			System.out.println(" 삭제를 진행할 상품이 없습니다ㅠ");
			System.out.println();
			return;
		}
		System.out.println();
        	 int input = Utils.nextInt("삭제할 메뉴의 상품코드를 입력해주세요 > ");
        	 if(cart.findBy(input) != null ) {{
        		 		getPickList().remove(findBy(input));
        		 		System.out.println("음료가 삭제되었습니다");
        		 		setCnt();
        		 	}
        	 	}else
        		 System.out.println("일치하는 상품코드가 없습니다"); 
		}
	
                 	
	//상품 찾기
	public ProductVO findBy(int no) {
		ProductVO product = null;
		for(int i = 0; i < pickList.size(); i++) {
			if(pickList.get(i).getProNum() == no) {
				product = pickList.get(i);
				break;
			}
		}
		return product;
	}
	
	
}