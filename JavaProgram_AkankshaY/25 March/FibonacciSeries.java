import java.util.Scanner;
class FibonacciSeries
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms for Fibonacci Series: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int c;

        System.out.println("Fibonacci Series: ");
        
        for(int i=1; i<=n; i++)
        {
            System.out.print(a+ " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}