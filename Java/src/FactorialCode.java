import java.util.Scanner;


class MathFact {
	
	// find the factorial 
	// define method to find the factorial of the given number 
	// Factorial of 3 is 3*2*1 = 6
	
	int findFact (int num){
		
		int fact=1;
		//System.out.println("num is "+ num );
		//System.out.println("fact is "+ fact);
		
		while( num > 1) {
			
			//System.out.println("inside loop");
			fact = fact * num ;
			//System.out.println("fact is "+ fact);
			num = num -1;
			
		}
		
		return fact;
	}
}


public class FactorialCode {

	public static void main(String[] args) {
				
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a number: ");
		int factNum = reader.nextInt(); // Scans the next token of the input as an int.
		reader.close();
		
		MathFact trial1 = new MathFact();
		int answer = trial1.findFact(factNum);
		System.out.println("Factorial of "+ factNum +" is "+answer);
		System.out.println("over and out!");
	}

}
