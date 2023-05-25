package 상속제예제1휴대폰;

public class GalaxyNote extends CellPhone {

		//필드
		String a;
		
		//생성자
		GalaxyNote(String model, String color, int channel, String a) {
			this.model = model;
			this.color =  color;
			this.a = a;
		}
		
		
		//메소드
		
		void print(String a) {
			System.out.println("Galaxy "+ a + "으로 그림을 그립니다.");
		}
	}
