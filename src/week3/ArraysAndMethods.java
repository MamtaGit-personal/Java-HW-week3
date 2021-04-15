package week3;

import java.text.DecimalFormat;

public class ArraysAndMethods {
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	public static void main(String[] args) {
		//an array of integer called ages 
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		//another array of integer called addedToAges 
		int [] newAgesArray  = {3, 9, 23, 64, 2, 8, 28, 93, 2};
				
		//an array of String called names 
		String[] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		double sumOfAge = 0;   // It's the sum of all the ages in the ages array
		int sumOfLettersInName = 0;  // It's the sum all the letters of each name in the names array
		String concatenatedName = "";  // to store the concatenated name from the names array
		
		int [] nameLengths = new int[names.length];  // an array to store the length of each name from the names array
		int sumOfNameLength = 0;  // To iterate over the nameLengths array to calculate the sum of lengths of all the names
		String fullName = ""; // fullName is concatenation of first name, a space and the last name
		String fName = "Paula";
		String lName = "Smith";
		
		int numberOfTimesConcatenateWord = 4;
		
		boolean isGreaterThan100;
		
		double [] doubleArrayOne = {8.1, 3.2, 200.3};
				
		double [] doubleArrayTwo = {9.1, 3.2, 200.3};
		
		double averageOfDoubleArray;  // average of all the elements in doubleArrayOne array
		boolean isDoubleArrayOneBigger; 
		
		boolean willBuyDrinks;  
		boolean isHotOutside = true; 
		double moneyInPocket = 10.0;
				
		
		/* 1 a. Programmatically subtract the value of the first element in the array from the value in the 
		 * last element of the array (i.e. do not use ages[7] in your code). Print the result to the console
		 */
		System.out.println("The length of the array is:" + ages.length);  
		System.out.println("1 a. The first element is:" + ages[0]   
		+ "\n     the last element is: " + ages[ages.length - 1] 
		+ "\nThe integer value after subtracting the first element from the last element of the array is: " 
		+ (ages[ages.length - 1] - ages[0]));
		
		
		/* 1 b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for 
		arrays of different lengths). */
		System.out.println("\nThe new length of the array is:" + newAgesArray.length);  
		System.out.println("1 b. The first element is:" + newAgesArray[0]   
		+ "\n     the last element is: " + newAgesArray[newAgesArray.length - 1] 
		+ "\nThe integer value after subtracting the first element from the last element of the array is: " 
		+ (newAgesArray[newAgesArray.length - 1] - newAgesArray[0]));
		
		
		
		/* 1 c. Use a loop to iterate through the array and calculate the average age. Print the result to the console */
		
		for(int i = 0; i < ages.length ; i++) {
			sumOfAge += ages[i];
		}
		System.out.println("\n1 c. The average age of the original array is: " + sumOfAge/ages.length);
		
		
		/* 2 a. Use a loop to iterate through the array and calculate the average number of 
		 * letters per name. Print the result to the console. */
		
		for(String name : names) {
			sumOfLettersInName += name.length();
		}
		System.out.println("\n2 a. The average number of letters per name is: " + (double)sumOfLettersInName/names.length);
		
		/* 2 b.	Use a loop to iterate through the array again and concatenate all the names together, 
		 * separated by spaces, and print the result to the console. */
		
		for(String name : names) {
			concatenatedName += name + " ";
		}
		System.out.println("\n2 b. The concatenation of all the names separated by spaces is: " + concatenatedName);
				
		//3. How do you access the last element of any array?
		System.out.println("\n3. How do you access the last element of any array?");
		System.out.println("The last element of an array is always one less than the length of the array.");
		
		
		//4. How do you access the first element of any array?
		System.out.println("\n4. How do you access the first element of any array?");
		System.out.println("The first element of an array is always at position zero of the array.");
				
		/* 5. Create a new array of integer called nameLengths. Write a loop to iterate over 
		 * the previously created names array and add the length of each name to the nameLengths array. */
		for(int i = 0; i < nameLengths.length ; i++) {
			nameLengths[i] = names[i].length();
		}
		
		/* 6.	Write a loop to iterate over the nameLengths array and calculate the sum of 
		 * all the elements in the array. Print the result to the console. */
		
		for(int length: nameLengths) {
			sumOfNameLength += length;
		}
		System.out.println("\n6. The sum of all the elements in the nameLengths array is: " + sumOfNameLength);
		
		/* 7. The name concatenated to itself n number of times.  */
		concatenatedName = createConcatenatedName(names[0], numberOfTimesConcatenateWord);
		System.out.println("\n7. The word: " + names[0] + " concatenated to itself "
		+ numberOfTimesConcatenateWord + " number of times is: " + concatenatedName);
				
		/* 8. Prints the first and the last name as a String separated by a space.  */
		fullName = createFullName(fName, lName);
		System.out.println("\n8. The full name is first name and last name separated by a space.");
		System.out.println("The first name is: " + fName + ", the last name is: " + lName + ". Hence the full name is: " + fullName);
		
		/* 9. Prints true if the sum of all the integers in the array is greater than 100 otherwise false.  */
		isGreaterThan100 = checkIfSumofIntIsEven(ages);
		System.out.println(", \nhence the boolean value of sum of all the integers is: "+ isGreaterThan100);
		
		/* 10. Prints the average of all the elements in the array.*/
		averageOfDoubleArray = calculateAverageOfDoubles(doubleArrayOne);
		System.out.println("\nThe average of all the elements in the array is: " + df2.format(averageOfDoubleArray));
		
		/* 11. Prints true if the average of first array is greater than the average of 
		*the second array otherwise false. */
		isDoubleArrayOneBigger = compareAverageOfTwoDoubleArrays(doubleArrayOne, doubleArrayTwo);
		System.out.println("The answer is: " + isDoubleArrayOneBigger);
				
		/* 12. Prints true if it is hot outside and if moneyInPocket is greater than 10.50 */
		willBuyDrinks = willBuyDrink(isHotOutside, moneyInPocket);
		System.out.println("Will I buy a drink is: " + willBuyDrinks);
				
		/*13. A method that checks to see if you can withdraw money from your bank account. You can withdraw money 
		 * from your account ONLY IF the balance is greater than 100 after subtracting the withdrawal amount. */
		double balance = 200;
		double amountToWithdraw = 100;
		
		boolean canWithdrawMoney = canWithdrawMoney(balance, amountToWithdraw);
		System.out.println("Can I withdraw money from my bank: " + canWithdrawMoney);
		
	} // main()
	
	/////  ALL THE METHODS WRITTEN BELOW   ////////
	
	/* 7. A method that takes a String, word, and an int, n, as arguments and returns 
	 * the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, 
	 * I would expect the method to return “HelloHelloHello”)
	 */
	public static String createConcatenatedName(String word, int n) {
		String concatenatedName ="";
		for(int i=0; i < n; i++) {
			concatenatedName += word;
		} // for loop
		
		return concatenatedName;
	} 
	
	/* 8. A method that takes two Strings, firstName and lastName, and returns a full name 
	 * which is the first and the last name as a String separated by a space. */
	public static String createFullName(String fName, String lName) {
		String fullName = fName + " " + lName;
		
		return fullName;
	}
	
	/*9. A method that takes an array of integer and returns true if the sum 
	 * of all the integers in the array is greater than 100	 */
	public static boolean checkIfSumofIntIsEven(int[] num) {
		boolean isGreaterThan100 = false;
		int sumOfIntergersInArray = 0;
		
		for(int i=0; i < num.length; i++) {
			sumOfIntergersInArray += num[i];
		} // for loop
		
		if(sumOfIntergersInArray > 100)
			isGreaterThan100 = true;
		else isGreaterThan100 = false;
		System.out.println("\n9. Print true if the sum of all the integers in the array is greater than 100 otherwise false");
		System.out.print("The sum of all the integers in the array is: " + sumOfIntergersInArray);
				
		return isGreaterThan100;
	} //checkIfSumofIntIsEven()
	
	/*10. A method that takes an array of double and returns the average of all the elements in the array */
	public static double calculateAverageOfDoubles(double[] num) {
		double sumOfDoublesInArray = 0;
		double averageOfDoublesInArray = 0;
		for(int i=0; i < num.length; i++) {
			sumOfDoublesInArray += num[i];
		} // for loop
		
		System.out.print("\n10. The sum of all the doubles in the array is: " + df2.format(sumOfDoublesInArray));
		averageOfDoublesInArray = sumOfDoublesInArray/num.length;
		
		System.out.print("\nThe array length is: " + num.length);
				
		return averageOfDoublesInArray;
	} //createAverageOfNumbers()
	
	/*11. A method that takes two arrays of double and returns true if the average of the elements 
	 * in the first array is greater than the average of the elements in the second array. */
	public static boolean compareAverageOfTwoDoubleArrays(double[] num1, double[] num2) {
		boolean isArrayOneBigger;
		double sumOfDoublesInArray1 = 0;
		double averageOfDoublesInArray1 = 0;
		double sumOfDoublesInArray2 = 0;
		double averageOfDoublesInArray2 = 0;
		
		for(int i=0; i < num1.length; i++) {
			sumOfDoublesInArray1 += num1[i];
		} // for loop for Array1
				
		for(int i=0; i < num2.length; i++) {
			sumOfDoublesInArray2 += num2[i];
		} // for loop for Array2
		
		if(averageOfDoublesInArray1 > averageOfDoublesInArray2)
			isArrayOneBigger = true;
		else isArrayOneBigger = false;
		
		System.out.println("\n11. Print true if the average of array ONE is greater than the average of "
		+ "the array TWO, otherwise false.");
		
		//System.out.println("The sum of all the doubles in array ONE is: " + df2.format(sumOfDoublesInArray1));
		averageOfDoublesInArray1 = sumOfDoublesInArray1/num1.length;
		System.out.println("The average of array ONE is: " + df2.format(averageOfDoublesInArray1));
		
		
		//System.out.println("The sum of all the doubles in array TWO is: " + sumOfDoublesInArray2);
		averageOfDoublesInArray2 = sumOfDoublesInArray2/num2.length;
		System.out.println("The average of array TWO is: " + df2.format(averageOfDoublesInArray2));
		
		return isArrayOneBigger;
	} //compareAverageOfTwoDoubleArrays()
	
	
	/*12. The willBuyDrink method takes a boolean isHotOutside,  and a double moneyInPocket, 
	* and returns true if it is hot outside and if moneyInPocket is greater than 10.50. */
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		boolean willBuyDrinks;
		if((isHotOutside == true) && (moneyInPocket > 10.50))
			willBuyDrinks = true;
		else willBuyDrinks = false;
		
		System.out.println("\n12. I will buy a drink if it is hot outside and if moneyInPocket is greater than 10.50");
		System.out.println("Money in my pocket is: " + moneyInPocket);
		System.out.println("Is it hot outside: " + isHotOutside);
		
		return willBuyDrinks;
	} 
	
	/*13. A method that checks to see if you can withdraw money from your bank account. You can withdraw money 
	 * from your account ONLY IF the balance is greater than 100 after subtracting the withdrawal amount. */
	public static boolean canWithdrawMoney(double balance, double withdrawAmount) {
		boolean canWithdrawMoney;
		System.out.println("\n13. My method lets you withdraw money from your bank ONLY IF your balance is greater than 100.0 after "
				+ "subtracting the withdrawal amount.");
		
		System.out.println("\nYour balance is: " + balance);
		System.out.println("Your withdrawal amount is:" + withdrawAmount);
		
		if((balance - withdrawAmount) > 100.0)
		{
			System.out.println("The balance after the withdrawal amount will be: " + (balance - withdrawAmount));
			canWithdrawMoney = true;
		}
		else {
			System.out.println("The balance after the withdrawal amount will be: " + (balance - withdrawAmount));
			canWithdrawMoney = false;
		}
		return canWithdrawMoney;
	} //canWithdrawMoney()
	
}
