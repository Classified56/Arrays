import java.util.Scanner;

public class NumbersArray1
	{
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				System.out.print("Please put in an eight digit number. ");
				int eightDig = userInput.nextInt();
				int deconDig[] = new int[8];
				int oddSum = 0, evenSum = 0;
				for(int i = 0; i < 8; i++)
					{
						deconDig[i] = eightDig % 10;
						if(deconDig[i] % 2 == 0)
							{
								evenSum += deconDig[i];
							}
						else
							{
								oddSum += deconDig[i];
							}
						eightDig /= 10;
					}
				System.out.println("The sum of the even numbers was: " + evenSum + ", and the sum of the odd numbers was: " + oddSum);
			}
	}
