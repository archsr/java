class Arith {
	
	int num1, num2, result;
	
	void add()
	{
		result = num1 + num2; 
	}
}

public class HelloWorld {

	
	public static void main(String[] args) {
		System.out.println("Hello World :)");
		Arith oper1 = new Arith();
		
		oper1.num1 = 32;
		oper1.num2 = 3;
		oper1.add();
		
		System.out.println("Answer is " + oper1.result);
	}

}
