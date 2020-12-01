package dataStruct2;
import java.util.Arrays;

public class Method3 {

	public static void toPower(int size, int power) {
		

//  Making Array
	
		int[] num = new int[size];
		int sum = num[0];
		for (size = 1; size < num.length; size++) {
			num[size] = size + sum;                    
			  
		} 
		

// Print Original Array
		
    	for (int i : num) {
			 System.out.println("Original Array: \n" + Arrays.toString(num) + "\n");
			 break;
		} 
    	
		
// Making new array to the power and printing
    	
    	
    	for (int i : num) {
			int answ1 = (int)Math.pow(num[i], power);
			num[i] = answ1;
			  
		} 
    	 System.out.println("New Exponential Array: \n" + Arrays.toString(num));

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// toPower Method
		toPower(4, 2);
	}

}
