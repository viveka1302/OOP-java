package Lab3.java;

public class Exp3_Prog4 {
	public static void main(String[] args) {
	        int sum=0;
	        for(int i=41;i<250;i++){   
	            if(i%5!=0){
	                sum=sum+i;   
	            }
	            else
	            {
	            	continue;
	            }
	        }
	         
	        System.out.println("The sum of intergers from 40 to 250 that divisible by 5 \n "+sum);
	    }
	}
