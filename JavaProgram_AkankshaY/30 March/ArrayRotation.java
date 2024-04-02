import java.util.Scanner;
class ArrayRotation
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the number of positions to rotate left: ");
        int k = sc.nextInt();
        
        System.out.println("Original array:");
        printArray(arr);
        
        rotateLeft(arr, k);
        
        System.out.println("Array after rotating left by " + k + " positions:");
        printArray(arr);
        
        sc.close();
	}

	static void rotateLeft(int[] arr, int k)
	{
		int n = arr.length;

		k = k % n;

		int[] temp = new int[k];

		for (int i = 0; i < k; i++)
		{
			temp[i] = arr[i];
		}

		for (int i = k; i < n; i++)
		{
			arr[i - k] = arr[i];
		}

		for (int i = 0; i < k; i++)
		{
			arr[n - k + i] = temp[i];
		}
	}

	static void printArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}