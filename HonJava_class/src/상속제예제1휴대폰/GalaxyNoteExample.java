package 상속제예제1휴대폰;

public class GalaxyNoteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//GalaxyNote 객체 생성
		GalaxyNote galaxyNote = new GalaxyNote("GalaxyNote", "레드", 13, "Pen");
		
		//CellPhone 클래스로부터 상속받은 필드
		System.out.println("모델: " + galaxyNote.model);
		System.out.println("색상: " + galaxyNote.color);

		//GalaxyNote 클래스의 필드
		
		//CellPhone 클래스로부터 상속받은 메소드 호출
		galaxyNote.powerOn();
		galaxyNote.bell();
		galaxyNote.sendVoice("여보세요");
		galaxyNote.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		galaxyNote.sendVoice("아~ 예 반갑습니다.");
		galaxyNote.hangUp();
		
		//DmbCellPhone 클래스의 메소드 호출
		galaxyNote.print("Pen");
		
	}

}
