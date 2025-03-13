package exercise2;

public class Person implements ICompute{
	
	private String name;
	private double basicSal;
	private double otRate;
	private double otHrs;
	private double netSal;
	
	Person(String name, double basicSal, double otRate, double otHrs){
		
		this.name = name;
		this.basicSal = basicSal;
		this.otRate = otRate;
		this.otHrs = otHrs;
	}
	
	@Override
	public void calculate() {
		
		netSal = basicSal + (otRate * otHrs);
		
	}
	
	@Override
	public void display() {
		
		System.out.println("Name : " + name);
		System.out.println("Net Salary : " + netSal);
	}

}
