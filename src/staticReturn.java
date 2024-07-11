
public class staticReturn {
		int c=2;
		public static int add(int a,int b)
		{
			return a+b;
		}
	
		
public int sub(int a,int b)
{
	return a-b;
}
 
public int sq()
{
	return c*c;
}

	public static void main(String cp[])
	{
		staticReturn s=new staticReturn();
		int res = s.sq();
		System.out.println(res);
		int r = s.sub(2, 2);
		System.out.println(r);
		int r1 = s.add(2, 2);
		System.out.println(r1);
	}
}