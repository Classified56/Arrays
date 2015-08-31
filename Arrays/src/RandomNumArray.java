
public class RandomNumArray
	{
		public static void main(String[] args)
			{
				int numArray[] = new int[5];
				for(int i = 0; i < 5; i++)
					{
						int randNum = (int)((Math.random() * 90) + 10);
						numArray[4 - i] = randNum;
					}
				for(int twoNums : numArray)
					{
						System.out.println(twoNums);
					}
				
			}

	}
