package com.student.model;

public class Student {
	
	private int id;
	private String name;
	private int age;
	private String address;
	private double math;
	private double phy;
	private double comp;
	private double avg;

	public Student() { }

	public Student(int id, String name, int age, String address, double math, double phy, double comp) {  
		super();  
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.math = math; 
		this.phy = phy; 
		this.comp = comp;
		this.avg = (math + phy + comp) / 3;
	}

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
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getPhy() {
		return phy;
	}

	public void setPhy(double phy) {
		this.phy = phy;
	}

	public double getComp() {
		return comp;
	}

	public void setComp(double comp) {
		this.comp = comp;
	}
	
	public double getAvg() {
		return avg;
	}
	
	public void setAvg(double avg) {
		this.avg = avg;
	}

}
