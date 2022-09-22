class TaskTwo
{

	public static void main(String[] args)
	{
		printPartOfWord("København", 1,6);
	}


	public static void printPartOfWord(String word, int startIndex, int endIndex)
	{
		String s = word.substring(startIndex,endIndex);
		System.out.println(s);
	}

} 