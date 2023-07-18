package service;

import java.util.List;

import main.KioskMain;
import util.Utils;
import vo.Administrator;
import vo.ProductVO;

public class AdministratorServiceImpl implements AdministratorService {

	private static AdministratorService administratorService = new AdministratorServiceImpl();

	public static AdministratorService getInstance() {
		return administratorService;
	}

	private AdministratorServiceImpl() {
	}

	OrderService orderService = OrderServiceImpl.getInstance();
	ProductService productService = ProductServiceImpl.getInstance();
	MemberService memberService = MemberServiceImpl.getInstance();
	List<ProductVO> productVOs = productService.getProCategory();
	Cart cart = Cart.getInstance();
	Administrator admin = new Administrator();

	/**
	 * @함준혁 관리자 로그인 탭입니다. 관리자 로그인 탭으로 비밀번호를 입력받아 맞으면 관리자탭으로, 틀리면 다시돌아갑니다.
	 */
	public void isAdmin() {
		if (admin.getPw() == null) {
			pwRegister();
		}

		String pw = Utils.nextLine("비밀번호를 입력하시오");
		if (pw.equals(admin.getPw())) {
			admin();
		} else {
			System.out.println("비밀번호가잘못되었습니다.");
		}
	}

	/**
	 * @함준혁 관리자 탭입니다. 1.매출조회 2.상품등록 3.상품삭제 4.재고조회 5.회원조회. 6.회원수정 7.메인화면입니다.
	 */
	public void admin() {
		int input = productService
				.checkRange(Utils.nextInt("1.매출조회   2.상품등록   3.상품삭제   4.회원조회   5.회원수정  6.관리자비밀번호수정 7.메인화면"), 1, 7);

		switch (input) {
		case 1:
			checkTotalSales();
			break;
		case 2:
			register();
			break;
		case 3:
			remove();
			break;
		case 4:
			memberList();
			break;
		case 5:
			edit();
			break;
		case 6:
			pwRegister();
			break;
		case 7:
			KioskMain.run();
			break;
		}

	}
	public void memberList() {
		memberService.getMemberList().forEach(System.out::println);
		admin();
	}

	/**
	 * @함준혁 매출 조회 orderService에 저장되어있는 총 매출값을 출력합니다.
	 */
	public void checkTotalSales() {
		System.out.println("총 매출 : " + orderService.totalSales());
		admin();
	}

	/**
	 * @함준혁 상품등록 1. 상품 카테고리를 입력 받아 카테고리 목록 출력 2. 상품번호 입력받아. productService의 findby를
	 *      이용하여, 중복탐색 3. 중복시 " 이미 있는 상품입니다 " 비중복시 상품추가
	 */
	public void register() {
		int proCategory = productService
				.checkRange(Utils.nextInt("상품 카테고리 번호를 입력하세요 > 1.커피   2.티   3.라떼   4.디저트   5.etc"), 1, 5);
		int proNum = productService.checkRange(Utils.nextInt("상품번호를 입력하세요 >"), proCategory * 100,
				proCategory * 100 + 100);
		if (productService.findBy(proNum) != null) {
			System.out.println("이미 있는 상품입니다.");
			register();
		} else {
			String proName = Utils.nextLine("상품명을 입력하세요 >");
			int proPrice = Utils.nextInt("상품 가격을 입력하세요. >");
			productService.getProCategory().add(new ProductVO(proNum, proName, proPrice, proCategory));
			productService.findBy(proNum).setCnt(1);
			System.out.println("상품이 등록되었습니다.");
			productService.save();
			admin();
		}
	}

	/**
	 * @함준혁 상품삭제 1. 삭제하실 상품번호를 입력받는다. 2. productService에 있는 findBy를 사용하여 중복여부 확인 3.
	 *      중복 시 상품삭제 4. 비중복 시 상품이 존재하지 않는다는 문구 출력
	 */
	public void remove() {
		int proCategory = productService
				.checkRange(Utils.nextInt("상품 카테고리 번호를 입력하세요 > 1.커피   2.티   3.라떼   4.디저트   5.etc"), 1, 5);
		productService.showCategory(proCategory);
		int proNum = productService.checkRange(Utils.nextInt("삭제하실 상품번호를 입력하시오"), proCategory * 100,
				proCategory * 100 + 100);
		if (productService.findBy(proNum) != null) {
			productService.getProCategory().remove(productService.findBy(proNum));
			System.out.println("상품이 삭제되었습니다.");
			productService.save();
			admin();
		} else
			System.out.println("상품이 존재하지 않습니다.");
			admin();
	}

	/**
	 * @함준혁 edit :회원번호수정합니다. 수정하실 회원의 번호를 입력받아 meberService에 있는findMember를 이용하여
	 *      전화번호값을 찾습니다. 비중복시에는 존재하지않는번호, 중복시 번호를 입력받아. 수정합니다.
	 */
	public void edit() {
		String tel = Utils.nextLine("수정하실 회원의 번호를 입력해주세요");
		if (memberService.findMember(tel) != null) {
			String tel2 = Utils.nextLine("바꾸실 번호를 입력해주십시오.");
			memberService.findMember(tel).setTel(tel2);
			System.out.println("기존번호" + tel + " 에서" + tel2 + "로 수정이 완료되었습니다.");
			admin();
		} else {
			System.out.println("존재하지않는번호입니다.");
			admin();
		}
	}

	/**
	 * @함준혁 pwRegister 비밀번호를 입력받아 수정합니다.
	 */
	public void pwRegister() {
		admin.setPw(Utils.nextLine("설정하실 비밀번호값을 입력해주십시오."));
		System.out.println("비밀번호 수정이 완료되었습니다.");
		admin();
	}

}