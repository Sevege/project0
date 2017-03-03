import java.util.Scanner;

public class ProjectZero {

	public static void main(String[] args) {

			Scanner cin = new Scanner(System.in);
			System.out.print("Enter two numbers: ");
			
			if (cin.hasNextInt(2)){
				int first = cin.nextInt(2);
			if (cin.hasNextInt(2)) {
				int second = cin.nextInt(2);
				addBinaryNumbers(first,second);
			}else if(cin.hasNextInt()){
				int second = cin.nextInt();
				bigFunction(first,second);	
			}else if (cin.hasNextDouble()) {
				double second = cin.nextDouble();
				bigFunction(first,second);
			} 
			else{
				System.out.println("Please try again and enter numbers.");
			}

		} 
			else if(cin.hasNextInt()){
				int first = cin.nextInt();
				if (cin.hasNextInt(2)) {
					int second = cin.nextInt(2);
					bigFunction(first, second);
				} 
				else if(cin.hasNextInt()){
					int second = cin.nextInt();
					bigFunction(first,second);
				}
				else if (cin.hasNextDouble()) {
					double second = cin.nextDouble();
					bigFunction(first,second);
				} 
				else{
					System.out.println("Please try again and enter numbers.");
				}
			}
			else if (cin.hasNextDouble()) {
			double first = cin.nextDouble();

			
			if(cin.hasNextInt(2)){
				int second = cin.nextInt(2);
				bigFunction(first,second);
				
			}else if (cin.hasNextDouble()) {
				double second = cin.nextDouble();
				bigFunction(first,second);
			}else{
				System.out.println("Please try again and enter numbers.");
			}
			}else {
			System.out.println("Please try again and enter numbers.");
		}
			cin.close();	
	}
	/*
	 * @return the sum of 
	 */
	public static void bigFunction(int a, int b) {
		int sum = a+b;
		System.out.println("The sum of " + a + " and "+ b + " is " + sum +".");
	}
	
	public static void bigFunction(double a, double b) {
		double sum = a+b;
		System.out.println("The sum of " + a +" and "+ b + " is " + sum +".");
	}
	public static void addBinaryNumbers(int a, int b){
		String first = Integer.toBinaryString(a);
		String second = Integer.toBinaryString(b);
		String addBin = Integer.toBinaryString(a + b);
		int sum = Integer.parseInt(addBin);
		System.out.println("The sum of " + first + " and " + second + " is " + sum + ".");
	
	}
	}
	
	


