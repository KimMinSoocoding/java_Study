package chapter08;

public class EmpEx {
	public static void main(String[] args) {
		Programmer programmer = new Programmer();
		programmer.goWork();
		programmer.work();
		programmer.getOffWork();
		
		Designer designer = new Designer();
		designer.goWork();
		designer.work();
		designer.getOffWork();
		
		System.out.println("================================");
		// Emp에 배열을 만들면 상속받은 자손들의 인스턴스를 Emp 배열 인스턴스안에 넣을 수 있다.
		
		Emp[] emps = new Emp[10];
		
		for(int i = 0 ; i < emps.length; i+=2) {
			emps[i] = new Programmer();
//			emps[i+1] = new Programmer();
			emps[i+1] = new Designer();
			
		}
		for(Emp e : emps) {
			e.goWork();
			e.work();
//			if(e instanceof Programmer) {
//				((Programmer)e).work();
//			}else {
//				((Designer)e).work();
//			}
			e.getOffWork();
		}
//		Emp emp = new Emp();  Emp가 추상화 되었기때문에 인스턴스 생성불가 
		
		
	}
}
				
