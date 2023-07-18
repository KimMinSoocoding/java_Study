package student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import static student.StudentUtils.*;

public class StudentService {
	Scanner scn = new Scanner(System.in);
//	private Student[] students = new Student[10];
//	private Student[] sortedStudents; // 일단값이 없음 정렬시기를 모르기때문에 정렬이 할당될때 정렬이 배정됨
	private int cnt; // 현재 학생 수 
	private List<Student> students = new ArrayList<>();
	private List<Student> sortedStudents;
	
	{
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student2.ser"))) {
			students = (List<Student>) ois.readObject();
		} catch (FileNotFoundException e) {
			// 초기화 블럭을 이용한 더미 데이터 사용
			students.add(new Student(1001, "홍길동1", 90,80,70));
			students.add(new Student(2002, "홍길동2", 80,40,98));
			students.add(new Student(3003, "홍길동3", 45,43,76));
			students.add(new Student(4004, "홍길동3", 45,56,67));
			students.add(new Student(5005, "홍길동3", 45,78,13));
			students.add(new Student(6006, "홍길동3", 45,89,34));

		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		} 
		
		sort();
	}
	// CRUD
//	void extendsLimit() {
//		Student[] tmp = new Student[students.length * 2]; // 배열의 길이는 변경이 안되니 하나 더만듬 
//		System.arraycopy(students, 0 , tmp, 0, students.length);
//		students = tmp;
//	}
	
	// 입력값 범위 확인 
	int checkRange(int num) {
		return checkRange(num, 0, 100);
	}
	int checkRange(int num, int start, int end) {
		if(num < start || num > end) {
			throw new MyRangeException(start,end);
		}
		return num;
	}
	
	// 등록하기 
	public void register() {
		int no = checkRange(nextInt("학번을 입력하세요 > "), 1000, 9999);
//		for(int i=0; i<cnt; i++) {
//			if(students[i].getNo() == no ) {
//				System.out.println("중복된 학번입니다 메뉴를 다시 입력해주세요");
//				return;
//			}
			if(findBy(no) != null) {
				System.out.println("중복학번이 존재합니다");
				return;
			}
//		int no = StudentUtils.nextInt("학번을 입력하세요 > ");
			String name = nextLine("이름을 입력하세요 > ");
			int kor = checkRange(nextInt("국어점수를 입력하세요 > "));
			int eng = checkRange(nextInt("영어점수를 입력하세요 > "));
			int mat = checkRange(nextInt("수학점수를 입력하세요 > "));
			
			Student student = new Student(no, name, kor, eng, mat);
//			if(students.length == cnt) { // 배열의 길이를 언제 늘려야 되는가? 등록할때에 students 랭스와 cnt가 같아질때에 
//				extendsLimit();
//			}
//			students[cnt++] = student;
			
			students.add(student);
			return;
			}
		
		
	
	
	// 조회하기 
	 void list() {
		 Collection<Student>  s = null;
		 switch (checkRange(nextInt("1. 입력순 조회 2. 석차별 조회"),1,2)) {
		case 1: 
			s = students;
			break;
		case 2: 
			s = sortedStudents;
			break;

		default:
			break;
		}
		 
		System.out.println("학번   이름   국어   영어   수학   총점   평균");
		System.out.println("======================================");
//		for(int i=0; i < s.size() ; i++) {
//			System.out.println(s.get(i));
//		}
		for(Student ss : s) {
			System.out.println(ss);
		}
	}
//	 void list2() {
//		 System.out.println("학번   이름   국어   영어   수학   총점   평균");
//		 System.out.println("======================================");
//		 for(int i=0; i < cnt ; i++) {
//			 System.out.println(sortedStudents[i]);
//		 }
//	 }
	 
	  // 성적 오름차순 조회하기 
	 public void sort() { 
		 save();
		sortedStudents = new ArrayList<>(students);
		Collections.sort(sortedStudents);
		
		 
	 }
	 private void save() {
		 try(ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("student2.ser"))) {
			 ois.writeObject(students);
		 }catch(IOException e) {
			 e.printStackTrace();
		 }
	 }
	 
	
	Student findBy(int no) { // 자료들이 먼저 어디에 저장되는가 : 학생배열에
//		for(int i=0; i<cnt; i++) {
//				if(students[i].getNo() == no) {
//					return students[i];
//				}
//			}
//			return null;
		
			Student student = null;
			for(int i=0; i < students.size() ; i++) {
				if(students.get(i).getNo() == no) {
					student = students.get(i);
					break;
				}
			}
			return student;
		}
	
	// 수정하기 
	void modify() {
		// 학생정보수정 : 이름, 국, 영, 수 수정 
		// 수정할 학번정보를 입력받기, 
//		int stuNo = scn.nextInt();
//		for(int i=0; i<cnt; i++) {
//			if( students[i].getNo() == no ) {
//				
//			}
//			
//		  } 
			Student student = findBy(StudentUtils.nextInt("학번을 입력하세요")); // 만들어 놓은것을 재활용하자
			if(student == null) {
				System.out.println("입력한 학번과 일치하는 학생이 없습니다.");
				return;
			}
				student.setName(nextLine("이름을 입력하세요"));
				student.setKor(checkRange(nextInt("국어점수를 입력하세요 > ")));
				student.setEng(checkRange(nextInt("영어점수를 입력하세요 > ")));
				student.setMat(checkRange(nextInt("수학점수를 입력하세요 > ")));
				sort();
		  } 
	
	// 삭제하기
//	void delete() {
		// 학생수 cnt 
		// 학생정보가 들어가있는 곳 Student 타입의 students 
//		System.out.println("학번을 입력하세요");
//		int no = scn.nextInt();
//		Student[] sto = students ;
//		for(int i=0; i<cnt; i++) {
//			if(sto[i].getNo() == no) {
//			sto[i] = null;
//				cnt --;
//				return;
//			}else if(sto[i].getNo() != no) {
//				System.out.println("학번이 일치하지 않습니다");
//				break;
//			}
//		}
//	}
//	
	public void remove() {
//		int no = nextInt("삭제할 학생의 학번을 입력하세요");
//		for(int i=0; i < cnt; i ++) {
//			if(students[i].getNo() == no) {
//				System.arraycopy(students, i+1, students, i, cnt-- -1-i);
//				break;
//			}
//		}
		students.remove(findBy(nextInt("삭제할 학생의 학번을 입력하세요")));
		sort();
	}
	
	
//	void delete2() {
//		Student student = findBy(StudentUtils.nextInt("학번을 입력하세요")); // 만들어 놓은것을 재활용하자
//		if(student == null) {
//			System.out.println("입력한 학번과 일치하는 학생이 없습니다.");
//			return;
//		}
//		for(int i=0; i<cnt; i++) {
//			if(students[i].getNo() == student.getNo()) {
//				students[i] = null;
//			}
//		}
//	}
	
	//Test
	public static void main(String[] args) {
		StudentService service = new StudentService();
//		System.out.println(Arrays.toString(service.students));
//		System.out.println(service.findBy(2).getName());
//		service.sort();
		service.list();
//		service.list2();
		
	}
}
