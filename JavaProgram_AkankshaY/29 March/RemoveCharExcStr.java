class RemoveChar
{
	public static void main(String args[])
	{
		String str = "Hello, Akanksha1508!";

		String result = removeChar(str);

		System.out.println("String after removing the characters: " + result);

	}

	public static String removeChar(String str)
	{
		String regex = "[^a-zA-Z]";

		String result = str.replaceAll(regex, "");

		return result;
	}
}