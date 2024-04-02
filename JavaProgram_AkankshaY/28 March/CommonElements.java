import java.util.Arrays;
class CommonElements
{
	public static void main(String args[])
	{
		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = {4, 5, 6, 7, 8};

		int[] commonElements = findCommonElements(array1, array2);

		System.out.println("Common elements between the two arrays are: "+ Arrays.toString(commonElements));

	}

	public static int[] findCommonElements(int[] array1, int[] array2)
	{
		Arrays.sort(array1);
		Arrays.sort(array2);

		int[] tempArray = new int[Math.min(array1.length, array2.length)];
		int index = 0;
		int i = 0, j = 0;

		while (i < array1.length && j < array2.length)
		{
			if (array1[i] < array2[j])
			{
				i++;
			}
			else if (array1[i] > array2[j])
			{
				j++;
			}
			else 
			{
				tempArray[index++] = array1[i];
				i++;
				j++;
			}
		}

		int[] CommonElements = Arrays.copyOf(tempArray, index);
		return CommonElements;
	}
}