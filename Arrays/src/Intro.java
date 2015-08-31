
public class Intro
	{
		public static void main(String[] args)
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
