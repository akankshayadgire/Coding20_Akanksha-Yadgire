import java.util.*;
class UniqueNumbers
{
	public static void main(String args[])
	{
		int[] numbers = {1, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10};

		Set<Integer> uniqueNumbers = new HashSet<>();

		for(int num : numbers)
		{
			uniqueNumbers.add(num);
		}

		System.out.println("Original Array: "+ Arrays.toString(numbers));
		System.out.println("Unique numbers in the array: ");
		for(int uniqueNum : uniqueNumbers)
		{
			System.out.println(uniqueNum);
		}
	}
}