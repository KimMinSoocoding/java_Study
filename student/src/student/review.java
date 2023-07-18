package student;

import java.util.Scanner;
import static student.StudentUtils.*;

public class review {
	Scanner scn = new Scanner(System.in);
	private Student[] students = new Student[10]; //Student 값을 배열로 변수에 저장
	private Student[] sortedStudents; // 일단값이 없음 정렬시기를 모르기 때문
	private int cnt; // 학생수 
	
	{
		// 초기화 블럭을 이용한 더미 데이터 사용 
		students[cnt++] = new Student(1001, "홍길동1", 80,90,89);
		students[cnt++] = new Student(2002, "홍길동2", 80,90,89);
		students[cnt++] = new Student(3003, "홍길동3", 80,90,89);
		students[cnt++] = new Student(4004, "홍길동4", 80,90,89);
	}
	
	// 배열길이 늘리는 메서드
	void extendsLimit() {
		Student[] tmp = new Student[students.length*2]; // 배열의 길이는 변경이 안되니 하나 더 만듬
		System.arraycopy(students, 0, tmp, 0, students.length);
		students = tmp;
	}
	
	// CRUD 
	
	// 등록하기 
	public void register() {
		int no = nextInt("학번을 입력하세요 >");
		if(findBy(no) != null) {
			System.out.println("중복학번이 존재합니다");
			return;
		}
		String name = nextLine("이름을 입력하세요 >");
		int kor = nextInt("국어점수를 입력하세요 >");
		int eng = nextInt("영어점수를 입력하세요 >");
		int mat = nextInt("영어점수를 입력하세요 >");
		
		Student student = new Student(no, name, kor, eng, mat);
		if(students.length == cnt) {
			extendsLimit();
		}
		students[cnt++] = student;
		return;
		}
		
	// 조회하기 
	void list() {
		Student[] s = null;
		switch (nextInt("1.입력순 조회 2 석차별 조회")) {
		case 1:
			s = students;
			break;
		case 2:
			s = sortedStudents;
			break;

		default:
			break;
		}
		System.out.println("학번  이름  국어  영어  수학  총점  평균");
		System.out.println("================================");
		for(int i=0; i<cnt; i++) {
			System.out.println(s[i]);
		}
	 }
	
	// 성적 오름차순 조회하기
	public void sort() {
		sortedStudents = new Student[students.length];
		for(int i=0; i<cnt; i++) {
			for(int j=0; j<cnt-1; j++) {
				if(sortedStudents[j].getTotal() < sortedStudents[j+1].getTotal()) {
					Student tmp = sortedStudents[j];
					sortedStudents[j] = sortedStudents[j+1];
					sortedStudents[j+1] = tmp;
					}
				}
			}
		}
	
	// 지정인덱스 조회
	Student findBy(int no) {
		Student student = null;
		for(int i=0; i < cnt ; i++) {
			if(students[i].getNo() == no) {
				student = students[i];
				break;
				}
			}
			return student;
		}
	
	// 수정하기 
	void modify() {
		Student student = findBy(nextInt("학번을 입력하세요"));
		if(student == null) {
			System.out.println("입력한 학번과 일치하는 학생이 없습니다");
			return;
		}
		student.setName(nextLine("이름을 입력하세요"));
		student.setKor(nextInt("국어점수를 입력하세요 >"));
		student.setKor(nextInt("영어점수를 입력하세요 >"));
		student.setKor(nextInt("수학점수를 입력하세요 >"));
		sort();
	}
	
	// 삭제하기 
	public void remove() {
		int no = nextInt("삭제할 학생의 학번을 입력하세요");
		for(int i=0; i <cnt; i++) {
			if(students[i].getNo() == no) {
				System.arraycopy(students, i+1, students, i, cnt-- -1-i);
				break;
			}
		}
		sort();
	}
	
	
}
