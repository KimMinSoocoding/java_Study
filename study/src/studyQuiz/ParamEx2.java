package studyQuiz;

public class ParamEx2 {
	public static void main(String[] args) {
		int result = add(10,20);
		System.out.println(result);
		result = add(5,5);
		System.out.println(result);
		
		int x = 5; 
		int y = 0; 
		y = f(x); // x의 제곱 리턴 
		System.out.println(y);
	}
	
	static int add(int x, int y) {
		return x+y;
	} 
	
	static int f(int x) {
		return x*x;
	}
}
