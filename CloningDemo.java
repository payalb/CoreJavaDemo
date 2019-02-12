package day2;

import java.util.ArrayList;
import java.util.List;

public class CloningDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student obj= new Student();
		Student obj1= obj.clone();
		System.out.println(obj==obj1);//false
		System.out.println(obj.getSubjects()==obj1.getSubjects());//true
	}
}


class Student implements Cloneable
{
	int id;
	String name;
	List<String> subjects= new ArrayList<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	//Object: Object
	@Override
	public Student clone() throws CloneNotSupportedException {
		//return (Student) super.clone();
		
		Student obj= new Student();
		obj.setId(this.id);
		obj.setName(name);
		obj.setSubjects(new ArrayList(subjects));
		return obj;
	}
}