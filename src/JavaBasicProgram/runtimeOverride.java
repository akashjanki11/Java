package JavaBasicProgram;

public class runtimeOverride extends SubOverride{

	public static void main(String[] args) {
		SubOverride s1=new SubOverride();
		s1.employee(2);
		
		superOverride s2=new superOverride();
		s2.employee(3);
	}

}
