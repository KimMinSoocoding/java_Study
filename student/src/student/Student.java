package student;

import java.io.Serializable;

// 학생
public class Student implements Comparable<Student>, Serializable{
	
	// 학번, 이름, 국어, 영어, 수학
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int mat;
//	private boolean enabled;
	
	// 생성자 

	// 기본생성자 

	// 모든 필드를 사용하는 생성자 
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(int no, String name, int kor, int eng, int mat) {
		super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	
	
	// 총점, 평균, 
	// 총점 getTotal , 평균 getAvg
	
//	void getTotal1() {
//		int total = kor+eng+mat;
//	}
//	
//	void getAvg1() {
//		double avg = (int)(getTotal()/3d*100) / 100d;
//		System.out.println(avg);
//	}
	


	public int getTotal() { // 메서드 생성 타입맞춰서 
		return kor + eng + mat;
	}
	
	public double getAvg() { // 메서드 생성 타입맞춰서 
		return (int)(getTotal()/3d*100) / 100d;
	}
	
	
	// getter , setter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public String toString() {
		String ret = null;
		ret = no + " " + name + "" 
		+ String.format("%4d %4d  %4d  %4d  %2.2f", kor,eng,mat,getTotal(),getAvg());
		return ret;
	}
	
	@Override
	public int compareTo(Student o) {
		return o.getTotal() - getTotal();
	}
	
//	public boolean isEnabled() {
//		return enabled;
//	}
//	public void setEnabled(boolean enabled) {
//		this.enabled = enabled;
//	}
	
	// Test
//	public static void main(String[] args) {
//		Student student = new Student(1, "홍길동", 100, 79, 80);
//
//		System.out.println(student.getTotal());
//		System.out.println(student.getAvg());
		
//		student.getAvg1();

//	}
}
