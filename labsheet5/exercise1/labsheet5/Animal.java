package labsheet5;

abstract class Animal {
	
	private String name;
	
	public Animal() {
		
		System.out.println("Animal Constructor called");
	}
	
	public Animal (String name) {
		
		this.name = name;
	}
	
	abstract String speak();
	
	public void display() {
		
		System.out.println("My name is " + this.name + ". " + this.speak() + ".");
	}
	
}
