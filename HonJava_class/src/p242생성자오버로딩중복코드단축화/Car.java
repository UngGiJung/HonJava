package p242생성자오버로딩중복코드단축화;

public class Car {
	//필드(=속성,맴버변수)
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car() {
		
	}
	
	Car(String model) {
		this(model,"은색",250);
	}
	
	Car(String model, String color) {
		this(model,color,250);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
