package exercise3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		int maxSubjects;
		int[] marks = new int [5];
		int total = 0;
		double avg;
		
		try {
		
		try {
			
			try {
				
				try {
					
					Scanner scanner = new Scanner (System.in);
					
					System.out.println("Input a value for Maximum number of subjects : ");
					maxSubjects = scanner.nextInt();
					
					for(int i = 0; i < maxSubjects; i++) {
						
						System.out.println("Input the value : ");
						marks[i] = scanner.nextInt();
						
						total = marks[i] + total;
						avg = total / i;
						
					}
					
					
				}catch(InputMismatchException e1) {
						
						System.out.println("Input type is mismatched");
					}
					
					
				}catch(ArithmeticException e2) {
					
					System.out.println("Arithmetic error occured");
					
					
				}
				}catch(ArrayIndexOutOfBoundsException e3) {
			
					System.out.println("Array is out of Bound");
			
				}
	
			
			
			
			
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		
		finally {
			
			System.out.println("This code will be guarenteed to run");
		}
		
		
		System.out.println("The end");
	}
	
}


