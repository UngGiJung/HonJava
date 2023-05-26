package p349강제타입변환예제;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
//		parent.field2 = "date2"; //에러
//		parent.method3();		 //에러
		
		Child child = (Child) parent;
		child.field2 = "yyy";
		child.method3();
	}

}
