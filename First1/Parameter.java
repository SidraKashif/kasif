package construction1;

public class Parameter {
	int a=100;
	int b=200;
	/*void sum()
	{
		System.out.print(a+b);         Not taking parameter and do not return value.
	}*/
	private int sum;
	
	//int sum()
	//{ 
		//return(a+b);                Not taking parameter but return value,
	//}
	//void sum(int x,int y)           Taking parameter but not return values.
	//{
	//int	sum=x+y;
	//System.out.println(x+y);
	//}
	int sum(int x,int y)
	{
		return(x+y);
	}
	
	
	
	

	public static void main(String[] args) {
		Parameter p =new Parameter();
		//{
			//p.sum();
			//System.out.println(p.sum());
		//}
		//p.sum(1000,2000);
		
		System.out.println(p.sum(1000,2000));

	}

}
