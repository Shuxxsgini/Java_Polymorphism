/*Method Overloading:
 * -It'll have the same METHOD name
 * -Same class
 * -Different Argument
 *   =different data type of Argument
 *   =different no. of argument
 *   =sequence of argument
 * 
 * QUES-Using METHOD OVERLOADING ,find greatest of 2,3 and 4 numbers.
 */
public class MethodOverloading {
	
	void greatest(int a, int b ){
		
		if(a>b)
		{
			System.out.println("Greatest Numbeer amongst "+a+" and "+b+" is: "+a);
		}
		else
		{
			System.out.println("Greatest Numbeer amongst "+a+" and "+b+" is: "+b);
		}
		
	}
	void greatest(int a ,int b, int c) {
		
        
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
	
	void greatest(int a ,int b,int c,int d)
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
		MethodOverloading obj=new MethodOverloading();
		obj.greatest(5, 10);
		obj.greatest(7, 19, 2);
        obj.greatest(5, 9, 99, 33);
	}

}
