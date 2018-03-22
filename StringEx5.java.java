/* public boolean equals(String);
          IQ:  == vs equals( );   */

import java.lang.String;
class StringEx5
{   public static void main(String args[])
   	   { String s1="Sai";
	     String s2="Sai"; or
	     String s2=new String("Sai");
		    if(s1==s2)
		      System.out.println("B R S");
			else
				System.out.println("B R N S ");

          if( s1.equals(s2) )
			  System.out.println("Same");
		  else
			  System.out.println("Not ");

	   }
}
