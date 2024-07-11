package ConstructorMethod;

public class MultipleConstructor {
	public MultipleConstructor(int a)
	{
		System.out.println(a*a);
	}
	
	public MultipleConstructor(int a,int b)
	{
		System.out.println(a*b);
	}
	
	public static void main(String cp[])
	{
		MultipleConstructor m1=new MultipleConstructor(2);
		MultipleConstructor m2=new MultipleConstructor(2,1);
	}
}
