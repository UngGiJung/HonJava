package p451예외클래스ClassCastExceptionExample예제;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);

	}
	
	public static void changeDog(Animal animal) {
		//if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
		//}
	}

}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

