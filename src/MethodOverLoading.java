
public class MethodOverLoading {
		public void add(int a,int b)
		{
			System.out.println(a+b);
		}
		
		public void sub(int a,int b)
		{
			System.out.println(a-b);
		}
		
		public static void main(String cp[])
		{
			MethodOverLoading m1=new MethodOverLoading();
			m1.add(1, 1);
			m1.sub(2, 1);
		}
}
