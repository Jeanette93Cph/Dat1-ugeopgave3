import java.util.Random;


class MathWork
{
	

	public static void main(String[] args)
	{ 	

		//3.e

		//3.e Random random = new Random();
		//3.e int[] arr ={ 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10};
		
	
		//3.b divisible(100);

		//3.e int randomeNumber = random.nextInt(arr.length);

		//3.e System.out.println(arr[randomeNumber]);

		functionNumber(4);

	}



//3.b 

	/* public static void divisible(int a)
	{
		for(int i=1; i<100; i++)
		{
			int b = a/i; 
			System.out.println(b);
		}	
	}
*/


//3.f

	public static void functionNumber(int a)
	{
		if(a > 0)
		{	
			int c = a-1; 
			System.out.print(c);
			functionNumber(c);

		}
	}
}