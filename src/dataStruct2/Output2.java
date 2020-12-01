package dataStruct2;

public class Output2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//  What is the output?
		
        double[ ] exampleArray = {1,5,6,5,4,1};

        double maximum = exampleArray[0];

        int index = 0;

        for (int i = 1; i < exampleArray.length; i++){

             if (exampleArray[ i ] > maximum) {

                  maximum = exampleArray[ i ];

                  index = i;

             }

        }
// Output is 2 because i = 2 is > maximum
        System.out.println(index);
	}

}
