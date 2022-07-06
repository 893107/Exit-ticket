package setp01.model.domain;

public class People {
	
	private String name;
	private int age;
	
	public People() {
		System.out.println("People()");
	}
	public People(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("People(String name, int age)");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("setName(String name)");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		System.out.println("setAge(int age)");
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("People [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}
	
   
}
