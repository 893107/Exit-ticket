package step02.model.domain;

public class Car {
	
	private String carName;
	private int carNo;
	
	public Car() {
		System.out.println("Car()");
		
	}
	public Car(String carName, int carNo) {
		this.carName = carName;
		this.carNo = carNo;
		System.out.println("Car(String carName, int car No)");
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getCarNo() {
		return carNo;
	}
	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [carName=");
		builder.append(carName);
		builder.append(", carNo=");
		builder.append(carNo);
		builder.append("]");
		return builder.toString();
	}


}
