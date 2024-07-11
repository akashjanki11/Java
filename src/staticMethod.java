
public class staticMethod {

			 static int a=10;
			 static int b=2;
			public static void add()
			{
				System.out.println("Add: "+(a+a));
			}
			
			public void sub()
			{
				System.out.println("Sub: "+(a));
			}
			
			public static void main(String cp[])
			{	staticMethod s1=new staticMethod();
			s1.sub();
				s1.add();
				System.out.println(b);
			}
	}


