package com.sd.Draw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSort  {
	
	/*ArrayList<Student> studentList= new ArrayList<Student>();
	
	Student student= new Student();*/
	
	

	private static List<Student> getCreateStudents(){
		List<Student> students= new ArrayList<Student>();
		
		Student student = new Student();
		student.setName("taeyoung");
		students.add(student);
		
		student = new Student();
		student.setName("jungmin");
		students.add(student);
		
		student = new Student();
		student.setName("yujung");
		students.add(student);
		
		return students;
		
	}
	
	static class NameAscCompare implements Comparator<Student>{

		@Override
		public int compare(Student arg0, Student arg1) {
			// TODO Auto-generated method stub
			return arg0.getName().compareTo(arg1.getName());
		}
	}
	static class NameDescCompare implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Student> students= getCreateStudents();
		
		System.out.println("===정렬전===");
		for(Student s:students){
			System.out.println(s);
		}
		
		Collections.sort(students, new NameAscCompare());
		System.out.printf("===이름 오름차순===\n");
		for(Student s:students){
			System.out.println(s);
		}
		Collections.sort(students, new NameDescCompare());
		System.out.printf("===이름 내림차순===\n");
		for(Student s:students){
			System.out.println(s);
		}
		
	}
}
