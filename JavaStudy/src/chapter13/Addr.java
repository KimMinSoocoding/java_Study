package chapter13;

import java.util.Objects;

public class Addr implements Comparable<Addr> {
	String tel;
	String name;
	public Addr(String tel, String name) {
		super();
		this.tel = tel;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Addr [tel=" + tel + ", name=" + name + "]";
	}
	
	public boolean equals(Object obj) {
		return tel.equals(((Addr)obj).tel) && name.equals(((Addr)obj).name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(tel,name);
	}
	@Override
	public int compareTo(Addr o) { //나와 남을 비교할것임 Addr=나자신의 tel  <비교>  o=남의 tel  = 양수는 내림차순 음수는 오름차순 정렬 
		return tel.compareTo(o.tel); //전화번호를 가지고 오름차순을 하겠다  compare  = 양수냐 음수냐를따짐 
	}
	
}
