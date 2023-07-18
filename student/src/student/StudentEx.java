package student;

public class StudentEx {
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
