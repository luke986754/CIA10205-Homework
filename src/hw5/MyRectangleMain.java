package hw5;

public class MyRectangleMain {
	//無參數建構子
	public static void main(String[] args) {
		MyRectangle mr = new MyRectangle();
		mr.setWidth(10);
		mr.setDepth(20);
		
		mr.getArea();
		System.out.println();

	
//	//帶參數建構子

		MyRectangle mr2 = new MyRectangle(10,20);
		mr2.getArea();
		
	}

}
