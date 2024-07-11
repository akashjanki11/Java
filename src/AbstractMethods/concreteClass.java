package AbstractMethods;

public class concreteClass extends parentClass {

	@Override
	public void add(int a,int b) {
		System.out.println(a+b);	
	}
	
	public void display()
	{
		System.out.println("This is concrete class"); 
	}

}
