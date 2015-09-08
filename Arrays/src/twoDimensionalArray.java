import java.util.Scanner;
public class twoDimensionalArray
	{
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				System.out.print("How many rows do you want? ");
				int rows = userInput.nextInt();
				System.out.print("How many columns do you want? ");
				int cols = userInput.nextInt();
				int numArray[][] = new int[rows][cols];
				int largeNum = 0, smallNum = 100;
				for(int row = 0; row < rows; row++)
					{
						for(int col = 0; col < cols; col++)
							{
								int ranNum = (int)((Math.random() * 90) + 10);
								numArray[row][col] = ranNum;
								System.out.print(numArray[row][col] + "\t");
								if(largeNum < numArray[row][col])
									largeNum = numArray[row][col];
								if(smallNum > numArray[row][col])
									smallNum = numArray[row][col];
							}
						System.out.println(" ");
					}
				System.out.println("The largest number is " + largeNum + ". The smallest number is " + smallNum);
			}

	}
