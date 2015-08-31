import java.util.Scanner;

public class InputFour
	{
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				System.out.print("Please put in a four digit number. ");
				int inNum = userInput.nextInt();
				int numArray[] = new int[4];
				for(int i = 0; i < 4; i++)
					{
						numArray[i] = inNum % 10;
						inNum /= 10;
					}
				for(int strip : numArray)
					{
						System.out.print(strip);
					}
			}
	}
