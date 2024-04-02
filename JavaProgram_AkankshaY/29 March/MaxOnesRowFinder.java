class MaxOnesRowFinder
{
	public static void main(String args[])
	{
		int[][] matrix = {
			{0, 1, 1, 1},
			{0, 0, 1, 1},
			{1, 1, 1, 1},
			{0, 0, 0, 0}
		};

		int maxRowIndex = findMaxRow(matrix);
		System.out.println("Max row index: " + maxRowIndex);

	}

	public static int findMaxRow(int[][] matrix)
	{
		int maxRow = -1;
		int maxOnes = -1;
		int rowIndex = 0;

		for (int[] row : matrix)
		{
			int ones = countOnes(row);

			if (ones > maxOnes)
			{
				maxOnes = ones;

				maxRow = rowIndex;
			}

			rowIndex++;
		}

		return maxRow;
	}

	public static int countOnes(int[] row)
	{
		int count = 0;

		for (int i=0; i<row.length; i++)
		{
			if (row[i] == 1)
			{
				count++;
			}
		}

		return count;
	}
}