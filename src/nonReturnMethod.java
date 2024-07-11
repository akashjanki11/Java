
public class nonReturnMethod {
		public int add()
		{
			return 10+20;
		}
		
		public String name()
		{
			return "Ram";
		}
		
		public static void main(String cp[])
		{
			nonReturnMethod n=new nonReturnMethod();
			System.out.println(n.add());
			System.out.println(n.name());
		}
}
