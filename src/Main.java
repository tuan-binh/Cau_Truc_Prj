import java.util.Arrays;

public class Main
{
	public static void main(String[] args)
	{
		/**
		 * [
		 *    [1,2,3,4],
		 *    [5,6,7,8],
		 *    [9,1,4,6]
		 * ]
		 * */
		int[][] arr = {
				  {1, 2, 3, 4},
				  {5, 6, 7, 8},
				  {9, 1, 4, 6}
		};
//		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++)
		{
//			for (int j = 0; j < arr[i].length; j++)
//			{
//				System.out.print(arr[i][j] + " ");
//			}
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}