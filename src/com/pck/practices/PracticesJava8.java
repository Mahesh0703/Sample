package com.pck.practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/*
Get student with exact match name "anyname"
Get student with matching address "1235"
Get all student having mobile numbers 3333.
Get all student having mobile number 1233 and 1234
Create a List<Student> from the List<TempStudent>
Convert List<Student> to List<String> of student name
Convert List<students> to String
Change the case of List<String>
Sort List<String>
Conditionally apply Filter condition, say if flag is enabled then.
 */
public class PracticesJava8 {

	int age;
	String name;
	String city;
	int pincode;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public PracticesJava8(int age, String name, String city, int pincode) {
		super();
		this.age = age;
		this.name = name;
		this.city = city;
		this.pincode = pincode;
	}
	public PracticesJava8() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "PracticesJava8 [age=" + age + ", name=" + name + ", city=" + city + ", pincode=" + pincode + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, city, name, pincode);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PracticesJava8 other = (PracticesJava8) obj;
		return age == other.age && Objects.equals(city, other.city) && Objects.equals(name, other.name)
				&& pincode == other.pincode;
	}
	
	public static void main(String[] args) {
		List<PracticesJava8> list= new ArrayList<>();
		list.add(new PracticesJava8(22,"mahesh","pune",411033));
		list.add(new PracticesJava8(25,"sham","kolhapur",411016));
		list.add(new PracticesJava8(30,"raju","sangali",411033));
		list.add(new PracticesJava8(25,"yogesh","mumbai",411012));
		list.add(new PracticesJava8(32,"ram","sangali",4110551));
		list.add(new PracticesJava8(32,"Tejal","sangali",41102541));
		list.add(new PracticesJava8(32,"Priya","pimpari",411021));
		
//		Get student with exact match name "anyname"
		
		String a = "ram";
		PracticesJava8 practicesJava8 = list.stream().filter(i->i.getName().equals(a)).findFirst().get();
		System.out.println(practicesJava8.getName());
		
//		Get student with matching address "411012"n)
		Integer pincode  = 411012;
		PracticesJava8 practicesJava82 = list.stream().filter(i->i.getPincode()==411012).findFirst().get();
		System.out.println(practicesJava82.getPincode());
		
		PracticesJava8 obj= new PracticesJava8();
		List<String> collect = list.stream().map(s -> s.getName()).collect(Collectors.toList());
		System.out.println(collect);
		
		List<Integer> collect2 = list.stream().map(i->i.getAge()+5).collect(Collectors.toList());
		System.out.println(collect2);
		
		
		List<Integer> collect3 = list.stream().filter(i->i.getCity().contains("sangali")).map(i->i.getAge()-5).collect(Collectors.toList());
		System.out.println(collect3);
	}
	
	
	
}
