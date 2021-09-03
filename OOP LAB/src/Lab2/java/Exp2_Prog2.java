package Lab2.java;
public class Exp2_Prog2 {
	public static void main(String[] args)
	{
		int i = 0,j= 0;
		i=Integer.parseInt(args[0]);
		j=Integer.parseInt(args[2]);
		
		if(args[1].equals("+"))
        {
            System.out.println(+(i+j));
        }
		else if(args[1].equals("-"))
        {
          if(i > j)
            {
                System.out.println(+(i-j));
            }
            else
            {
                System.out.println(+(j-i));
            }
    	}
		else if(args[1].equals("*"))
        {
            System.out.println(+(j*i));
        }
        else if (args[1].equals("/"))
        {
            System.out.println(+(j/i));
        } 
        else {
        	System.out.println("Wrong Argument: unable to identify the operator");
        }
	}
}
