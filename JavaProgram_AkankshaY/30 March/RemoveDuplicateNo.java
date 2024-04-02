import java.util.*;
class RemoveDuplicateNo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.println("Original array: ");
		printArray(arr);

		int[] uniqueArray = removeDuplicates(arr);

		System.out.println("Array after removing duplicates: ");
		printArray(uniqueArray);

		sc.close();
	}

	static int[] removeDuplicates(int[] arr)
	{
		Arrays.sort(arr);

		int n = arr.length;
		int j = 0;

		for (int i=0; i<n-1; i++)
		{
			if (arr[i] != arr[i + 1])
			{
				arr[j++] = arr[i];
			}
		}

		arr[j++] = arr[n - 1];

		int[] result = new int[j];
		for (int i=0; i<j; i++)
		{
			result[i] = arr[i];
		}

		return result;
	}

	static void printArray(int[] arr)
	{
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
}