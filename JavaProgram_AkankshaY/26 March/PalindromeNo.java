import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);

		System.out.println("Enter number: ");

		int n = sc.nextInt();

		int sum = 0;


		int temp = n;

		while(n>0)
		{
			
			int r = n % 10;

			sum = (sum*10) + r;

			n = n/10;
		}

		if(temp == sum)
		{
			System.out.println("The given number is Palindrome !");
		}
		else 
		{
			System.out.println("The given number is not a Palindrome !");
		}
	}
}