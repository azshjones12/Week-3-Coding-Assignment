
public class ArraysAndMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Question 1
		int[] ages = new int[] {3,9,23,64,2,8,28,93};
		
		//Question 1a
		int rangeOfArray = ages[ages.length-1] - ages[0]; 
		System.out.println(rangeOfArray);
		
		//Question 1b
		int[] ages2 = new int[] {3,9,23,64,2,8,28,93,30};
		int rangeOfArray2 = ages2[ages2.length-1] - ages2[0]; 
		System.out.println(rangeOfArray2);
		
		//Question 1c
		double sum = 0;
		for (int age: ages2) {
			sum += age;
		}

		double averageAge2 = sum / ages2.length; 
		System.out.println(averageAge2);
		
		//Question 2
		String[] names = new String[] {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//Question 2a
		double sumOfCharacters = 0;
		for (String name: names) {
			int countStringCharacters = name.length();
			sumOfCharacters += countStringCharacters;
		}
	
		double averageNumLetters = sumOfCharacters / names.length;
		System.out.println(averageNumLetters);
			
		//Question 2b
		String allNamesTogether = "";
		for (String name: names) {
			allNamesTogether += name + " ";
		}
			
		System.out.println(allNamesTogether);
		
		//Question 3 - example of how to access last element of an array 
		//using index of array.length-1
		int[] array = new int[] {2, 3, 4, 5};
		System.out.println(array[array.length-1]);

		//Question 4 - example of how to access first element of an array 
		//using index of zero
		System.out.println(array[0]);
		
		//Question 5
		int[] nameLengths = new int[6];
			for (int i = 0; i < names.length; i ++) {
				int lengthOfEach = names[i].length();
				nameLengths[i] = lengthOfEach;
			}
			
		//Question 6
		int sumOfNameLengths = 0;
		for (int nameLength: nameLengths) {
			sumOfNameLengths += nameLength;
		}
	
		System.out.println(sumOfNameLengths);
			
	}
	
	//Question 7
	public static String multiplyString(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;
		}
		return result;
	}
	
	//Question 8
	public static String createFullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName; 
	}
	
	//Question 9
	public static boolean greaterThan100(int[] numbers) {
		int sumOfNumbers = 0;
		for (int number: numbers) {
			sumOfNumbers += number;
		}
		if (sumOfNumbers > 100) {
			return true;
		} else {
			return false;
		}
	}
	
	//Question 10
	public static double averageOfArray(double[] numbers) {
		double sum = 0;
		for (double number: numbers) {
			sum += number;
		}
		double average = sum / numbers.length; 
		return average;
	}
	
	//Question 11
	public static boolean compareArrayAverages(double[] numbers1, double[] numbers2) {
		double average1 = averageOfArray(numbers1);
		double average2 = averageOfArray(numbers2);
		
		if (average1 > average2) {
			return true;
		} else {
			return false;
		}
		
		}
	
	//Question 12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
	}
		
	}
	
	//Question 13 - This method takes an array of integers and returns the difference between the first 
	//element and the last element in the array. This method is created to eliminate the need to repeat code for question 1a and 1b; 
	//It is now possible to use this method to find the range of the first and last element for any array of integers. 

	public static int rangeOfArray(int[] numbers) {
		int rangeOfArray = numbers[numbers.length-1] - numbers[0]; 
		return rangeOfArray;
	}

}
