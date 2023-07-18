package student;

@SuppressWarnings("serial")
public class MyRangeException extends RuntimeException {
	private int start;
	private int end;
	
	public MyRangeException() {}

	public MyRangeException(int start, int end) {
		super(start + "와" + end + "사이의 값을 입력하세요");
	}
	
	
}
