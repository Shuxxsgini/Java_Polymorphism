/*Method Overriding:
 * -It'll have the same METHOD name
 * -Different class
 * -Same Argument
 * -Inheritance
 * QUES-Using METHOD OVERRIDING ,find greatest of 2,3 and 4 numbers.
 * 
 */

 class MethodOverriding {
     void GreatestOfTwo(int a ,int b)
     {
      	 if(a>b)
 		{
 			System.out.println("Greatest Numbeer:" +a);
 		}
 		else
 		{
 			System.out.println("Greatest Numbeer amongst "+a+" and "+b+" is: "+b);
 		}
    	 
     }
}
   class GreatestOfThree extends MethodOverriding
   {
	   void greatest3(int a,int b,int c)
	   {
		       
	        if(a>b) {
	        	if (a>c)
	        	{
	        		System.out.println("Greater is= "+a);
	            	
	        	}
	        	else 
	        	{
	        		System.out.println("Greater is= "+c);
	        	}
	        	
	        	
	        }
	        else if (b>c)
	        {
	        	System.out.println("Greatest is= "+b);
	        }
	        else if(b>c)
	        {
	        	System.out.println("Greater is= "+c);
	        }
	        else 
	        {
	        	System.out.println("Greatest is= "+c);
	        }
	        
	   }
	   
   }
   
   class GreatestOfFour extends GreatestOfThree
   {
	   void greatest4(int a ,int b,int c,int d)
	   {
	   
	   int max=0;
		if(a>=max)
		{
			max=a;
		}
		if(b>=max)
		{
			max=b;
		}
		if(c>=max)
		{
			max=c;
		}
		if(d>=max)
		{
			max=d;
		}
		System.out.println("Greatest Number is= "+max);
		
	   }
   
	public static void main(String[] args) {
		
		
		GreatestOfFour obj=new GreatestOfFour();
		obj.greatest4(9,22,5,7);
		
	}
  
   } 

