package step02.model.domain;

public class People {
	
	private String name;
	private int age;
	private Car car;
	
	public People() {
		System.out.println("People()");
	}
	public People(String name, int age, Car car) {
		this.name = name;
		this.age = age;
		this.car = car;
		System.out.println("People(String name, int age, Car car)");
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
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
		System.out.println("setCar(Car car)");
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("People [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", car=");
		builder.append(car);
		builder.append("]");
		return builder.toString();
	}
	
	}
	
