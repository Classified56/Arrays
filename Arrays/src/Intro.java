import java.util.Scanner;

public class Intro
	{
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				System.out.print("How many sweets do you like? ");
				int numSweet = userInput.nextInt();
				if(numSweet > 0)
					{
						String candyArray[] = new String[numSweet];
						Scanner sweetName = new Scanner(System.in);
						for(int i = 0; i < numSweet; i++)
							{
								System.out.print("What sweet do you like? ");
								String sweet = sweetName.nextLine();
								candyArray[i] = sweet;
							}
						for(String sweets : candyArray){
							System.out.println("You like " + sweets);
						}
					}
				else
					{
						System.out.println("You have a very healthy diet. ");
					}
			}
		
		public static void inClass()
			{
				int myArray[] = new int[5];
				for(int i = 0; i < myArray.length; i++)
					{
						myArray[i] = i * 3;
					}
				for(int i = 0; i < myArray.length; i++)
					{
						System.out.println(myArray[i]);
					}
				//for each loop
				for(int fred : myArray)
					{
						System.out.println(fred);
					}
			}
	}
