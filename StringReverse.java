package reverse;

import java.util.Scanner;

public class StringReverse {
	
	public static void main (String [] args ) 
	
	{
		
	    Scanner sc =new Scanner (System.in);
	    System.out.println("Enter string");
	    String name = sc.nextLine();
	    
	    String rev = "";
	    int len = name.length();
	    
	    for (int i=len-1; i>=0; i--) 
	    {
	    	
	    	rev = rev+name.charAt(i);
	    	//System.out.println(rev);
	    }
	    		System.out.println(rev);
	    
		
		
		
	}

		
	

}
