package student;

/**
 * 
 * @author minsoo
 *	1. 골격 생성( 서비스,유틸,메인, VO)
 *	2. 서비스의 기능구현(수정, 삭제)
 *	3. 접근제한자 추가 코드 변경 
 *	4. 배열 길이 확장
 *	5. 정렬규칙 추가(석차별)
 *	6. 학번 유일성 보장 
 *	7. 예외처리 추가 
 *	-numberFormatException 처리 
 *	8. 배열을 리스트로 변경 
 *	9. 파일을 통한 영속화 적용 
 *	10. 데이터베이스 연동 
 */
public class reviewEx {
 static	boolean run = true;
 static StudentService ss = new StudentService();
	public static void main(String[] args) {
		while(run) {
			try {
				run();
			} catch (NumberFormatException e) {
				System.out.println("적절한 숫자를 입력하세요");
			} catch (MyRangeException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	static void run() {
		int input = ss.checkRange(StudentUtils.nextInt("1. 조회  2. 등록  3. 수정  4. 삭제  5. 종료"),1,5);
		switch (input) {
		case 1: 
			ss.list();
			break;
		case 2: 
			ss.register();
			break;
		case 3: 
			ss.modify();
			break;
		case 4: 
			ss.remove();
			break;
		case 5: 
			run = false;
			break;
			
		default: break;
	}
  }
}
