package chap11;

// sort (인덱스, compareTo)
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Sample09 {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1,"학건"));
		list.add(new Employee(4,"빵형"));
		list.add(new Employee(3,"민철"));
		list.add(new Employee(2,"인호"));
		list.add(new Employee(5,"수학"));
		
		System.out.println(list.toString());
		Collections.sort(list);
		System.out.println(list.toString());
	}

}

//정렬할때 컴페어블실장
@Data
@AllArgsConstructor
class Employee implements Comparable<Employee>{
	private int sabun;
	private String name;
	
	@Override
	public int compareTo(Employee o) {
//		return this.sabun - o.sabun; //순정렬
//		return o.sabun - this.sabun  ; //역정렬
//		return this.name.compareTo(o.name);
		return o.name.compareTo(this.name);
	}
	
}