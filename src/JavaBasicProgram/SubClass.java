package JavaBasicProgram;

public class SubClass implements superClass {
	int a=10,b=20;
	@Override
	public void add() {
		System.out.println("Addition of two numbers: "+(a+b));
		
	}

	@Override
	public void sub() {
		System.out.println("Substraction of 2 no.: "+(a-b));
	}

}
