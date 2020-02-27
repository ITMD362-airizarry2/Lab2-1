package lab2;

//Author: Anthony Irizarry
//Date: 2/27/2020

public class BankRecords {

	private String id;
	private int age;
	private String sex;
	private String region;
	private double income;
	private String married;
	private int children;
	private String car;
	private String save_act;
	private String current_act;
	private String mortgage;
	private String pep;
	
	//Getters and Setters
	
	//id getter and setter
	public String getid() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id= id;
	}
	
	//age getter and setter
	public int getAge() {
	return this.age;
	}
	
	public void setAge(int age) {
		this.age= age;
	}
	
	//region getter and setter
	public String getRegion() {
		return this.region;
	}
	
	public void setRegion(String region) {
		this.region= region;
	}
	
	
	//income getter and setter
	public double getIncome() {
		return this.income;
	}
	
	public void setIncome(double income) {
		this.income= income;
	}
	
	//Married getter and setter
	public String getMarried() {
		return this.married;
	}
	
	public void setMarried(String married) {
		this.married= married;
		
	}
	
	//Children getter and setter
	public int getChildren() {
		return this.children;
	}
	
	public void setChildren(int children) {
		this.children=children;
	}
	
	//Car getter and setter
	public String getCar() {
		return this.car;
	}
	
	public void setCar(String car) {
		this.car=car;
	}
	
	
	
}
