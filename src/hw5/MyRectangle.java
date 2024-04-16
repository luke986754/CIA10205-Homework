package hw5;

public class MyRectangle {
	private double width, depth;
	
	public void setWidth(double width) {
		
			this.width = width;
	}
	
	public void setDepth(double depth) {
		
			this.depth = depth;
	}
	
	public void getArea() {
		System.out.print( width*depth);
	}
	
	public MyRectangle() {};
	
	
	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	 
	}
	
}
