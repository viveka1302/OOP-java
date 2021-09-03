package Lab2.java;
public class Exp2_Prog1 {
	public static void main(String[] args) {
		int i= 0,j=0,k=0 ;
		i=Integer.parseInt(args[0]);
		j=Integer.parseInt(args[1]);
		k=Integer.parseInt(args[2]);
		if(i > j && i > k)
        {
            System.out.println("Largest number is:"+i);
        }
        else if(j > k)
        {
            System.out.println("Largest number is:"+j);
        }
        else
        {
            System.out.println("Largest number is:"+k);
        }
	}
}
