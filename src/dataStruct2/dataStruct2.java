package dataStruct2;
import java.util.Scanner;
import java.util.Arrays;

public class dataStruct2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Program to sum all elements in Array
		
		Scanner userInput = new Scanner(System.in);
		int[] numList = new int[12];
		int sum = 0;
		System.out.println("Enter your twelve numbers: ");
		for (int i = 0; i < numList.length; i++) {
			 numList[i] = userInput.nextInt();
		
		} 
		
// Print array for user to view
		
		System.out.println("\nYour array is shown below: \n" + Arrays.toString(numList));
		
// Compute SUM
		
		for (int num : numList) {
			 sum += num;
			 
		}
		System.out.println(" \nThe sum of your array is: " + sum);
		
	}

}
