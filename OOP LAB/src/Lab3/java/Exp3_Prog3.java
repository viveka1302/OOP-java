package Lab3.java;

public class Exp3_Prog3 {
	public static void main(String[] args)
	{

		int i = 0;
		i =Integer.parseInt(args[0]);
		
		if(args[0].equals("1"))
        {
            System.out.println("January");
        }
		else if(args[0].equals("2"))
        {
			System.out.println("Febuary");
        }
		else if(args[0].equals("3"))
        {
            System.out.println("March");
        }
		else if(args[0].equals("4"))
        {
            System.out.println("April");
        }
		else if(args[0].equals("5"))
        {
            System.out.println("May");
        }
		else if(args[0].equals("6"))
        {
            System.out.println("June");
        }
		else if(args[0].equals("7"))
        {
            System.out.println("July");
        }
		else if(args[0].equals("8"))
        {
            System.out.println("August");
        }
		else if(args[0].equals("9"))
        {
            System.out.println("September");
        }
		else if(args[0].equals("10"))
        {
            System.out.println("October");
        }
		else if(args[0].equals("11"))
        {
            System.out.println("November");
        }
		else if(args[0].equals("12"))
        {
            System.out.println("December");
        }
        else {
        	System.out.println("Wrong Argument");
        }
	}
}

