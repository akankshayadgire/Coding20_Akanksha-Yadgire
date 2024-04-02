import java.util.Scanner;
class PangramChecker
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = sc.nextLine();

        if (isPangram(inputString)) 
        {
            System.out.println("The string is a pangram.");
        } 
        else 
        {
            System.out.println("The string is not a pangram.");
        }

        sc.close();
    }

    public static boolean isPangram(String str) 
    {
        
        boolean[] alphabetMark = new boolean[26];

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) 
            {
                alphabetMark[ch - 'a'] = true;
            }
        }

        for (boolean mark : alphabetMark) 
        {
            if (!mark) 
            {
                return false;
            }
        }

        return true;
    }

}