class EvenOddCounter
{
	public static void main(String args[])
	{
		int[] numbers = {2, 4, 8, 9, 10, 15, 16, 20, 25};

	    int evenCount = 0;
	    
	    int oddCount = 0;

	    for (int number : numbers)
	    {
	    	if (number % 2 == 0)
	    	{
	    		evenCount++;
	    	}
	    	else 
	    	{
	    		oddCount++;
	    	}
	    }

	    System.out.println("Number of even integers : " + evenCount);

	    System.out.println("Number of odd integers : " + oddCount);
	}
}