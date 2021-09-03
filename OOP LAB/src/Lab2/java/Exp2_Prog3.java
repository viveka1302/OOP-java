package Lab2.java;
class Result
{
	String Name;
	int Marks ;
	String Subject;
	Result(String a, int b ,String c)
	{
		Name = a;
		Marks = b;
		Subject = c;
		System.out.println("Name :"+a);
		System.out.println("Marks :"+b);
		System.out.println("Subject :"+c);
		System.out.println("");
	}
}
public class Exp2_Prog3 {

	public static void main(String[] args)
	{
		Result R1=new Result("Akhand",100,"OOP");
		Result R2=new Result("Ak1",100,"OOP");
		Result R3=new Result("Ak2",100,"OOP");
		Result R3=new Result("Ak3",100,"DEVOPS");
	}
}
