import java.util.*;
public class ArrayListChallenges
	{
		static ArrayList myArray = new ArrayList <Double>();
		static double temp;
		public static void main(String[] args)
			{
				
			challenge2();
			challenge3();
			challenge4();
			challenge5();
			challenge6();
			
			}

		private static void challenge2()
			{
			myArray.add(98.3);
			myArray.add(96.9);
			myArray.add(100.3);
			myArray.add(97.8);
			myArray.add(98.9);
			myArray.add(98.6);
			myArray.add(101.7);
			myArray.add(102.5);
			myArray.add(97.6);
			myArray.add(98.5);
			}

		private static void challenge3()
			{
			System.out.println("The fevers are: ");
			for (int i = 0; i < myArray.size(); i++)
				{
				temp = (Double) myArray.get(i);
				if (temp > 98.6)
					{
					System.out.println(temp);
					}
				}
			System.out.println("");
			}

		private static void challenge4()
			{
			System.out.println("The temperatures in Celsius are: ");
			for (int i = 0; i < myArray.size(); i++)
				{
				
				}
				
			}

		private static void challenge5()
			{
			
				
			}

		private static void challenge6()
			{
			
				
			}

	}
