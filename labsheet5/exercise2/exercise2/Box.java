package exercise2;

public class Box implements ICompute{
	
	private int length, width, height;
	private int volume;
	
	Box(int length, int width, int height){
		
		this.length = length;
		this.height = height;
		this.width = width;
	}
	@Override
	public void calculate() {
		
		volume = length * width * height;
		
	}
	
	@Override 
	public void display() {
		
		System.out.println("Volume of the box is : " + volume);
		
	}

}
